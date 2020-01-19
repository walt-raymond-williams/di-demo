package com.waltraymondwilliams.didemo.controllers;

import org.springframework.stereotype.Controller;
import org.w3c.dom.ls.LSOutput;

@Controller
public class MyController {

    public String hello(){
        System.out.println("hello!!!!");
        return " ";
    }
}
