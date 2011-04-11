package org.tcw.servlets;

import org.tcw.services.MyService;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Singleton
public class MyServlet extends HttpServlet {

    private MyService myService;

    @Inject
    public MyServlet(MyService myService) {
        this.myService = myService;
    }


    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().append(myService.getHello());
    }

}
