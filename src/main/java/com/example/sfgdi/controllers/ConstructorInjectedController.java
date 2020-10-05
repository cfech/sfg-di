package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;

public class ConstructorInjectedController {

    //makes this unchangeable once running through the constructor
    private final GreetingService greetingService;

    //here we inject using constructor
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreetingService() {
        return greetingService.sayGreeting();
    }
}
