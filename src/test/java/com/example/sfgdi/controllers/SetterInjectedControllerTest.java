package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;
import com.example.sfgdi.services.GreetingServiceImpl;
import com.example.sfgdi.services.GreetingServiceImplSpanish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;
    SetterInjectedController c2;

    @BeforeEach
    void setUp() {

        //here we set the controller to the setterInjected Controller
        controller = new SetterInjectedController();

        //here we injected the type of greeting services in the
        // setterInjectedController using a setter - medium preferred
        controller.setGreetingService(new GreetingServiceImpl());


        c2 = new SetterInjectedController();
        c2.setGreetingService(new GreetingServiceImplSpanish());


    }

    @Test
    void getGreeting() {
        System.out.println("---Setter injected-----");
        System.out.println(controller.getGreeting());
        System.out.println(c2.getGreeting());

    }
}