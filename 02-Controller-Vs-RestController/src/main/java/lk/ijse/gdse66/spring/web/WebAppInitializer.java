package lk.ijse.gdse66.spring.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //mulinma run wenne meka
    public WebAppInitializer() {
        System.out.println("WebAppInitializer () -- Contractor");
    }

    @Override//context eka hadagnna awasha details (annotationConfigWebApplication Context)
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebRootConfig.class};
    }

    @Override//context eka hadagnna awasha details (annotationConfigWebApplication Context)
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override//dispatcher Servlet eka hadaganna awasha details
    protected String[] getServletMappings() {
        return new String[]{"/"}; //default mapping
    }
}
