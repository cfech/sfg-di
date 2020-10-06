package com.example.sfgdi.controllers;

import com.example.sfgdi.services.ConstructorGreetingService;
import com.example.sfgdi.services.GreetingServiceImplSpanish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;
    ConstructorInjectedController c2;

    @BeforeEach
    void setUp() {

        //here we inject the dependency  right into the constructor - most clean and
        // best practice
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
        c2 = new ConstructorInjectedController(new GreetingServiceImplSpanish());

    }

    @Test
    void getGreetingService() {
        System.out.println("---Constructor injected-----");
        System.out.println(controller.getGreetingService());
        System.out.println(c2.getGreetingService());
    }
}