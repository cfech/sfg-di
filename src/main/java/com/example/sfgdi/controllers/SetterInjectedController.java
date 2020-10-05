package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;
    //here we inject using setter
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
