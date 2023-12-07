package com.example;

import io.vertx.core.http.HttpServerRequest;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Context;
import org.jboss.logging.Logger;

@ApplicationScoped
public class ServiceImpl implements Service {

    @Context
    HttpServerRequest request;

    @Inject
    Logger logger;

    @Override
    public String hello()  {
        String t = request.getHeader("foo");
        System.out.println(t);
        return "hello Eric";
    }
}
