package com.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard  run 5k!";
    }



}
