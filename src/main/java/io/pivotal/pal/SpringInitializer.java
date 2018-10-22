package io.pivotal.pal;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.filter.DelegatingFilterProxy;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class SpringInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.setInitParameter("contextClass", "org.springframework.web.context.support.AnnotationConfigWebApplicationContext");
        servletContext.setInitParameter("contextConfigLocation", "io.pivotal.pal");
        servletContext.addListener(ContextLoaderListener.class);

        servletContext.addFilter("springSessionRepositoryFilter", DelegatingFilterProxy.class)
                .addMappingForUrlPatterns(null, false, "/*");
    }
}