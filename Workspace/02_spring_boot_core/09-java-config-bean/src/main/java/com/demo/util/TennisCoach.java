package com.demo.util;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    public TennisCoach() {
        System.out.println("TennisCoach" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Tennis for 15 minutes !!!";
    }
}