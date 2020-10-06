package com.example.sfgdi;

import com.example.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		//THIS IS INVERSION OF CONTROL
		//No where int he app dow we create  a new MyController, when we want to access
		// it , spring sees this , adds it (a new bean) to the context and provides us
		// a new instance from the context, the framework does all the work for you and
		// it just provides you with an instance
		//THIS IS INVERSION OF CONTROL
		MyController myController = (MyController) ctx.getBean("myController");

		//Using profiles
		I8TnController i8TnController = (I8TnController) ctx.getBean("i8TnController");
		System.out.println(i8TnController.sayHello());


		//uses primary as a default
		System.out.println("---Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("Property ----");

		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");


		System.out.println(propertyInjectedController.getGreetingService());

		System.out.println("Setter---------");
		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("Constructor ------");

		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) ctx.getBean(
						"constructorInjectedController");

		System.out.println(constructorInjectedController.getGreetingService());

	}

}
