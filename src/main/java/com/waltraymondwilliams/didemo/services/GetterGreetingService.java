package com.waltraymondwilliams.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello! I was returned by a GetterGreetingService";
    }
}
