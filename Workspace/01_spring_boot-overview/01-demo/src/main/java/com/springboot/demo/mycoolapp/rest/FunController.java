package com.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {

//    Retrieving name property from application.properties file and using it globally in FunController class
    @Value("${name}")
    private String name;

    @GetMapping("/")
    public String printHello(){
        return "Hello World!" ;
    }
    @GetMapping("/name")
    public String printName(){
        return name; // printing the name property retreived from application.properties
    }

}
