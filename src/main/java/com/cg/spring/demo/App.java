package com.cg.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.spring.demo.config.SpringConfig;
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

// 

public class App {

	public static void main(String[] args) {

		System.out.println("Start");

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//		Employee emp = new Employee(); // dinner - disposable plates, reusable plates

		Employee emp = context.getBean(Employee.class);
		
		emp.setFirstName("Sonu");
		System.out.println(emp.toString());

		System.out.println("End");

	}
}
