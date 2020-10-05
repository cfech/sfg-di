package com.example.sfgdi;

import com.example.sfgdi.controllers.ConstructorInjectedController;
import com.example.sfgdi.controllers.MyController;
import com.example.sfgdi.controllers.PropertyInjectedController;
import com.example.sfgdi.controllers.SetterInjectedController;
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

		String greeting = myController.sayHello();

		System.out.println(greeting);

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
