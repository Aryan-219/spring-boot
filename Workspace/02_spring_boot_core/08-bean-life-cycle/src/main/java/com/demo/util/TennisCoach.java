package com.demo.util;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
//    public TennisCoach() {
//        System.out.println("TennisCoach"+getClass().getSimpleName());
//    }

    @PostConstruct
    public void startBean(){
        System.out.println("Starting Tennis bean");
    }

    @PreDestroy
    public void destroyBean(){
        System.out.println( "Destroying Tennis bean" );
    }
    @Override
    public String getDailyWorkout() {
        return "Practice Tennis for 15 minutes !!!";
    }
}
