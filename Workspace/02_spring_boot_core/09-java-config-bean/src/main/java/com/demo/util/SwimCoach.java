package com.demo.util;
//Note : Here we are not using the @Component on purpose because we don't want to mark this class automatically as a spring bean,
// instead we want to manually set up this class a java bean

import org.springframework.stereotype.Component;

//@Component
public class SwimCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Swim 1000m as a warmup! ";
    }

    public SwimCoach() {
        System.out.println("From constructor : " + getClass().getSimpleName());
    }
}
