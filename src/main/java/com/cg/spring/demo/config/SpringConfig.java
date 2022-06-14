package com.cg.spring.demo.config;

import org.springframework.context.annotation.Bean;

import com.cg.spring.demo.model.Employee;

public class SpringConfig {

	@Bean
	public Employee getEmployee() {

		return new Employee();

	}

}
