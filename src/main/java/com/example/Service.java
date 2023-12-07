package com.example;

import io.vertx.mutiny.core.http.HttpServerRequest;

public interface Service {
    String hello() throws AppException;
}
