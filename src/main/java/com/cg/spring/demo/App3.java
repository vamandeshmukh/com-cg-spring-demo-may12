package com.cg.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.demo.model.Employee;

/**
 * 
 * @author Vaman Deshmukh
 * 
 *         {@link https://github.com/vamandeshmukh/com-cg-spring-demo-may12}
 *
 */

// Bean == object == instance 

// Spring provides you beans == objects 

// DI - 
// dependency injection == provide objects 

// Spring configuration 
//- 1. Java based configuration 
//- 2. XML based configuration 
//- 3. Annotation based configuration 

// Example of - //- 2. XML based configuration 

public class App3 {

	public static void main(String[] args) {

		System.out.println("Start");

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		Employee emp = context.getBean(Employee.class);

		emp.setFirstName("Sonu");

		System.out.println(emp.toString());

		System.out.println("End");

		((AbstractApplicationContext) context).close();

	}
}
