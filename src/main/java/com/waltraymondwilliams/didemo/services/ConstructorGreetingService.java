package com.waltraymondwilliams.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Hello! I was returned by the ConstructorGreetingService";
    }
}
