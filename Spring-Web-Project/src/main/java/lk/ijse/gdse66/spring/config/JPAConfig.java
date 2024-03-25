package lk.ijse.gdse66.spring.config;

import jakarta.persistence.EntityManagerFactory;
import lombok.val;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/25/2024
 */

//@Configuration
//@EnableJpaRepositories
//@EnableTransactionManagement

public class JPAConfig {

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dmds = new DriverManagerDataSource();
        dmds.setUrl("jdbc:mysql://localhost:3303/gdse66_spring_web?createDatabaseIfNotExist=true");
        dmds.setUsername("root");
        dmds.setPassword("12345");
        dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return dmds;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setGenerateDdl(true);
        vendorAdapter.setShowSql(true);
        vendorAdapter.setDatabase(Database.MYSQL);
        vendorAdapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan("lk.ijse.gdse66.spring.entity");
        factory.setDataSource(dataSource);
        return factory;
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {

        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory);
        return txManager;
    }
}
