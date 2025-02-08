package com.demo.util;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
    public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println("BaseballCoach"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Baseball for 15 minutes !!!";

    }
}
