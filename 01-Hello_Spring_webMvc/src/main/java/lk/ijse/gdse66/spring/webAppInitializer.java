package lk.ijse.gdse66.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/1/2024
 */

public class webAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{webRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{webAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
