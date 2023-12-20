package com.example;

import java.util.Set;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/hello")
public class ExampleResource {

  @RestClient
  ExtensionsService service;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    Set<Extension> extensionSet = service.getById("abc");
    return "Hello from RESTEasy Reactive";
  }
}
