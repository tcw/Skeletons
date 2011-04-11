package org.tcw.rest;

import com.google.inject.Inject;
import com.google.inject.servlet.RequestScoped;
import org.tcw.services.MyService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("hello")
@RequestScoped
public class Hello {

    private MyService myService;

    @Inject
    public Hello(MyService myService) {
        this.myService = myService;
    }

    @GET
    @Produces("text/plain")
    public String getText(){
        return myService.getHello();
    }

}
