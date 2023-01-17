package com.monu.example.resource;

import com.google.inject.Inject;
import com.monu.example.response.HelloResponse;
import com.monu.example.service.HelloService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloResource {

    private final HelloService helloService;

    @Inject
    public HelloResource(HelloService service) {
        this.helloService = service;
    }

    @GET
    @Path("/{name}")
    public HelloResponse sayHello(@PathParam("name") String name) {
        return new HelloResponse(helloService.getMessage(name));
    }
}
