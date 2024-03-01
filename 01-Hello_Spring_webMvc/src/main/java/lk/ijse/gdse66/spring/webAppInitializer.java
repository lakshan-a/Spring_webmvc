package lk.ijse.gdse66.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/1/2024
 */

public class webAppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(webAppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();
    }
}
