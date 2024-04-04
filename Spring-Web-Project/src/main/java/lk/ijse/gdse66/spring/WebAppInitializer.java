package lk.ijse.gdse66.spring;

import jakarta.servlet.MultipartConfigElement;
import jakarta.servlet.ServletRegistration;
import lk.ijse.gdse66.spring.config.WebAppConfig;
import lk.ijse.gdse66.spring.config.WebRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import java.util.Properties;

/**
 * @version: v0.0.1
 * @author: LakshanR
 * @date: 3/27/2024
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {



    public WebAppInitializer() {
        String property = System.getProperty("java.io.tmpdir");
        System.out.println(property);
        System.out.println("WebAppInitializer () -- Contractor");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setMultipartConfig(new MultipartConfigElement("C:\\windows\\temp",1024*1024*10,1024*1024*20,1024*1024));
    }
}
