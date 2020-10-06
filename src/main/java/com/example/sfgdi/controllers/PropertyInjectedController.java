package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    //must tell spring to inject greeting service
    @Qualifier("propertyGreetingService")
    @Autowired
    //here we inject into public property
    public GreetingService greetingService;

    public String getGreetingService(){
        return  greetingService.sayGreeting();
    }

}
