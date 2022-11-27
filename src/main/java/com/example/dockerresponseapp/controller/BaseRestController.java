package com.example.dockerresponseapp.controller;

import com.example.dockerresponseapp.dto.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health/")
public class BaseRestController {
    private static final String RESPONSE_MESSAGE = "OK";
    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public Response hello() {
        return new Response(RESPONSE_MESSAGE);
    }
}
