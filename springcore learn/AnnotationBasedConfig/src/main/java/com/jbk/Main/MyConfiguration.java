package com.jbk.Main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import com.jbk.entity.Employee;
 @ComponentScan(basePackages = {"com.jbk"})
public class MyConfiguration {
      
	/*
	 * @Bean //@Scope(scopeName = "prototype") public Employee getEmployee() {
	 * 
	 * Employee e = new Employee(); return e; }
	 */
}
