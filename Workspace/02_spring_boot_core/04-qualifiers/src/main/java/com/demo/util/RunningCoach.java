package com.demo.util;

import org.springframework.stereotype.Component;

@Component
public class RunningCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Running for 15 minutes !!!";
    }
}

