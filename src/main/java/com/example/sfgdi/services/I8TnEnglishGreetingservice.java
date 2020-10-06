package com.example.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("en")
@Service("I8TnService")
public class I8TnEnglishGreetingservice implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello  - en";
    }
}
