package com.demo.util;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TennishCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Teenish for 15 minutes !!!";
    }
}
