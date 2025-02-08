package com.demo.util;

import org.springframework.stereotype.Component;

@Component
    public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Baseball for 15 minutes !!!";
    }
}
