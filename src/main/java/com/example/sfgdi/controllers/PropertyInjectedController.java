package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    //here we inject into public property
    public GreetingService greetingService;

    public String getGreetingService(){
        return  greetingService.sayGreeting();
    }

}
