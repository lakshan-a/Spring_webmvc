package lk.ijse.gdse66.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"lk.ijse.gdse66.spring.service","lk.ijse.gdse66.spring.repositories"})
@Import(JPAConfig.class)
@PropertySource("classpath:application.properties")
public class WebRootConfig {
    public WebRootConfig() {
        System.out.println("WebRootConfig () -- Contractor");
    }
}
