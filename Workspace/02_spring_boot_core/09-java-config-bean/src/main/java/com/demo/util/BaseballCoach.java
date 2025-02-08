package com.demo.util;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements Coach {
    public BaseballCoach() {
        System.out.println("BaseBall Coach : " + getClass().getSimpleName());

    }

    @Override
    public String getDailyWorkout() {
        return "Practice Baseball for 15 minutes !!!";

    }
}