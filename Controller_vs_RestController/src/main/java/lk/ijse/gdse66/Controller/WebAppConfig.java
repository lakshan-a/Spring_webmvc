package lk.ijse.gdse66.Controller;

import lk.ijse.gdse66.Controller.api.MyController1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/1/2024
 */

@Configuration
@EnableWebMvc
public class WebAppConfig {
    public WebAppConfig() {
        System.out.println("WebAppConfig() - constructor");
    }

    @Bean
    public MyController1 myController1(){
        return new MyController1();
    }
}
