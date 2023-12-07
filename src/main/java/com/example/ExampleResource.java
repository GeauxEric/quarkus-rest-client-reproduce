package com.example;

import io.vertx.mutiny.core.http.HttpServerRequest;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

@Path("/hello")
public class ExampleResource {

    @Inject ServiceImpl service;

//    @Context
//    HttpServerRequest request;
//    @Inject HttpServerRequest request;

    private static Logger  LOG = Logger.getLogger(ExampleResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        LOG.info("handling hello");

        return service.hello();
    }
}
