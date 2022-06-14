package com.cg.spring.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.spring.demo.model.Employee;

@Configuration
public class SpringConfig {

	@Bean
	public Employee getEmployee() {

		return new Employee();

	}

}
