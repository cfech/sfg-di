package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class I8TnController {

    private final GreetingService greetingService;

    public I8TnController(@Qualifier("I8TnService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
      return greetingService.sayGreeting();
    }
}
