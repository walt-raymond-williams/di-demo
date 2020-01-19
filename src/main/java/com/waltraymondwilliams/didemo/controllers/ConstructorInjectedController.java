package com.waltraymondwilliams.didemo.controllers;

import com.waltraymondwilliams.didemo.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;

//    @Autowired //not required for Constructor since ~Spring 4.2(?)
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
