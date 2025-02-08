package com.demo.util;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
    public class BaseballCoach implements Coach{

//    public BaseballCoach() {
//        System.out.println("BaseballCoach"+getClass().getSimpleName());
//    }

    @PostConstruct
    public void startBean(){
        System.out.println( "Starting baseball bean");
    }

    @PreDestroy
    public void destroyBean(){
        System.out.println( "Destroying baseball bean" );
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Baseball for 15 minutes !!!";

    }
}
