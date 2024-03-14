package lk.ijse.gdse66.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/14/2024
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "lk.ijse.gdse66.mapping.spec.api")
public class WebAppConfig {
}
