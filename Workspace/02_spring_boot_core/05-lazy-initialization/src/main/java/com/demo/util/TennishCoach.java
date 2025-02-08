package com.demo.util;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennishCoach implements Coach{
    public TennishCoach() {
        System.out.println("TennishCoach"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Teenish for 15 minutes !!!";
    }
}
