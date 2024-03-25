package lk.ijse.gdse66.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "lk.ijse.gdse66.spring.api")
public class WebAppConfig implements WebMvcConfigurer {
    public WebAppConfig() {
        System.out.println("WebAppConfig () -- Contractor");
    }



}
