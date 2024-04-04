package lk.ijse.gdse66.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 4/2/2024
 */


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"lk.ijse.gdse66.spring.api","lk.ijse.gdse66.spring.advice"})
public class WebAppConfig implements WebMvcConfigurer {
    public WebAppConfig() {
        System.out.println("WebAppConfig () -- Contractor");
    }



}
