package com.demo.springcore.rest;

import com.demo.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;
    private Coach anotherCoach;

   public DemoController( @Qualifier("cricketCoach")Coach coach,
                          @Qualifier("cricketCoach")Coach anotherCoach) {
        this.coach = coach;
        this.anotherCoach=anotherCoach;
    }



    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String checkBean(){
       return "Checking this coach and another coach : " + (coach == anotherCoach);
    }
}
