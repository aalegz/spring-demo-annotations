package com.aalegz.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("hfs")
    private FortuneService fortuneService;


    //define a default constructor
    public TennisCoach() {
        System.out.println(">>  Inside default constructor");
    }

    //define my init method
    //@PostConstruct
    public void doMyStartupStuff() {
        System.out.println(">>TennisCoach: Inside of doMyStartupStuff()");
    }

    //define my destry method
    //@PreDestroy
    public void doMyCLeanupStuff() {
        System.out.println(">>TennisCoach: Inside of doMyCleanupStuff()");
    }



    //define setter method
    /*@Autowired
    public void doSomeCrazyStuff(FortuneService fortuneService) {
        System.out.println(">>  Inside doSomeCrazyStuff method");
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    /*@Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
