package com.art.jenkinsstarter.service;

import com.art.jenkinsstarter.dto.GetHelloWorldDTO;
import com.art.jenkinsstarter.model.HelloWorld;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class HelloWorldService {

    public GetHelloWorldDTO getHelloWorld() {
        var helloWorldModel = new HelloWorld("Hello World!", LocalDate.now());

        return new GetHelloWorldDTO(helloWorldModel.message(), helloWorldModel.createdAt());
    }
}
