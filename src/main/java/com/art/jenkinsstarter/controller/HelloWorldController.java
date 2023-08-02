package com.art.jenkinsstarter.controller;

import com.art.jenkinsstarter.dto.GetHelloWorldDTO;
import com.art.jenkinsstarter.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hi")
public class HelloWorldController {

    private HelloWorldService service;

    @Autowired
    public HelloWorldController(HelloWorldService service) {
        this.service = service;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public GetHelloWorldDTO getHello() {
        return service.getHelloWorld();
    }
}
