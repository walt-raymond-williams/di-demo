package com.waltraymondwilliams.didemo.controllers;

import org.junit.Test;
import com.waltraymondwilliams.didemo.services.GreetingServiceImpl;
import org.junit.Before;

import static org.junit.Assert.assertEquals;


public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController=new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();

    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_WORLD, propertyInjectedController.sayHello());
    }


}