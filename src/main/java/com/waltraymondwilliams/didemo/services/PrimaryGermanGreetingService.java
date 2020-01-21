package com.waltraymondwilliams.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService{

    @Override
    public String sayGreeting(){
        return "Hast du et vas zeit fur mich, dann zing eich ein lieberdich";
    }
}
