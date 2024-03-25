package lk.ijse.gdse66.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"lk.ijse.gdse66.spring.service","lk.ijse.gdse66.spring.repositories"})
public class WebRootConfig {
    public WebRootConfig() {
        System.out.println("WebRootConfig () -- Contractor");
    }
}
