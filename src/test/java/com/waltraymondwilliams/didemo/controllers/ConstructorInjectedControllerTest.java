package com.waltraymondwilliams.didemo.controllers;

import com.waltraymondwilliams.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ConstructorInjectedControllerTest {
    ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception{
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{

        assertEquals(GreetingServiceImpl.HELLO_WORLD, this.constructorInjectedController.sayHello());
    }
}