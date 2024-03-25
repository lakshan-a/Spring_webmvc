package lk.ijse.gdse66.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse66.spring")
public class WebRootConfig {
    public WebRootConfig() {
        System.out.println("WebRootConfig () -- Contractor");
    }
}
