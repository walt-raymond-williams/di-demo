package com.waltraymondwilliams.didemo.controllers;

import com.waltraymondwilliams.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;
import org.w3c.dom.ls.LSOutput;

@Controller
public class MyController {

    GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.print("hello!!!! + ");
        System.out.println(greetingService.sayGreeting());
        return " ";
    }
}
