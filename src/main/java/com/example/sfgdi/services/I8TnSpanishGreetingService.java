package com.example.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"es", "default"})
@Service("I8TnService")
public class I8TnSpanishGreetingService implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Hola -ES";
    }
}
