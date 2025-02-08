package com.demo.util;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach{
    public RunningCoach() {
        System.out.println("RunningCoach" + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Running for 15 minutes !!!";
    }
}