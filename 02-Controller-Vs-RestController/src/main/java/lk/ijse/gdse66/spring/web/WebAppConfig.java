package lk.ijse.gdse66.spring.web;

import lk.ijse.gdse66.spring.web.api.MyControllerOne;
import lk.ijse.gdse66.spring.web.api.MyControllerTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class WebAppConfig  implements WebMvcConfigurer {
    public WebAppConfig() {
        System.out.println("WebAppConfig () -- Contractor");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/WEB-INF/page/**")
                .addResourceLocations("/WEB-INF/page/");
    }


    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/page/");
        resolver.setSuffix(".html");
        return resolver;
    }

    @Bean
    public MyControllerOne myControllerOne(){
        return new MyControllerOne();
    }

    @Bean
    public MyControllerTwo myControllerTwo(){
        return new MyControllerTwo();
    }
}
