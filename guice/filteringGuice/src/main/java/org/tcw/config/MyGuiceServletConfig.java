package org.tcw.config;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import org.tcw.filters.MyFilter;
import org.tcw.servlets.MyServlet;

public class MyGuiceServletConfig extends GuiceServletContextListener {

    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new ServletModule() {

            @Override
            protected void configureServlets() {

                filter("/*").through(MyFilter.class);

                serve("/hello").with(MyServlet.class);
            }
        });
    }
}