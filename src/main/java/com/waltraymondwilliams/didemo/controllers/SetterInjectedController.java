package com.waltraymondwilliams.didemo.controllers;


import com.waltraymondwilliams.didemo.GreetingService;
import com.waltraymondwilliams.didemo.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService=greetingService;
    }

}
