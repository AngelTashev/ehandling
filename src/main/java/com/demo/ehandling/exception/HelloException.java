package com.demo.ehandling.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class HelloException extends RuntimeException {

    public HelloException(String message) {
        super(message);
    }
}
