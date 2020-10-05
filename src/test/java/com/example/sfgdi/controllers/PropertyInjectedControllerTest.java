package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;
import com.example.sfgdi.services.GreetingServiceImpl;
import com.example.sfgdi.services.GreetingServiceImplSpanish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;
    PropertyInjectedController c2;


    //configuring test conditions
    //before each we create a new controller and set it to greetingServiceImpl
    @BeforeEach
    void setup(){
        //set our controller to be property injected
        controller = new PropertyInjectedController();

        //inject our greeting type into the property -- least preferred method
        controller.greetingService = new GreetingServiceImpl();


        c2 = new PropertyInjectedController();

        c2.greetingService = new GreetingServiceImplSpanish();


    }

    @Test
    void getGreetingService() {
        System.out.println("---Property injected----");
        System.out.println(controller.getGreetingService());
        System.out.println(c2.getGreetingService());

    }
}