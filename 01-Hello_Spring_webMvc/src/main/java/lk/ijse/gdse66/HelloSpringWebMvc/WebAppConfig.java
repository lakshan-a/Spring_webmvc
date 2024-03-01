package lk.ijse.gdse66.HelloSpringWebMvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse66.HelloSpringWebMvc.bean")
@EnableWebMvc

public class WebAppConfig {

}
