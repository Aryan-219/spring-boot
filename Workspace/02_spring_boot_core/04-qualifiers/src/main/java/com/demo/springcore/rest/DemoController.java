package com.demo.springcore.rest;

import com.demo.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;

   // @Autowired
    //public void setCoach(Coach coach) {
        //this.coach = coach;
//}
//   public DemoController( @Qualifier("cricketCoach")Coach coach) {

    public DemoController( Coach coach) {
        this.coach = coach;
    }



    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }

}
