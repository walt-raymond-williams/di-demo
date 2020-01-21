package com.waltraymondwilliams.didemo.controllers;

import com.waltraymondwilliams.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;

//    @Autowired //not required for Constructor since ~Spring 4.2(?)...
    // update: dealing with multiple implementations of GreetingService.
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
