package lk.ijse.gdse66.Controller;

import lk.ijse.gdse66.Controller.api.MyController1;
import lk.ijse.gdse66.Controller.api.MyController2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/1/2024
 */

@Configuration
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {
    public WebAppConfig() {
        System.out.println("WebAppConfig() - constructor");
    }

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB_INF/page");
        resolver.setSuffix(".html");
        return resolver;
    }

    @Bean
    public MyController1 myController1(){
        return new MyController1();
    }

    @Bean
    public MyController2 myController2(){
        return new MyController2();
    }
}
