package com.example.sfgdi.services;

import org.springframework.stereotype.Service;

//must tell spring this is a service
@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world";
    }
}
