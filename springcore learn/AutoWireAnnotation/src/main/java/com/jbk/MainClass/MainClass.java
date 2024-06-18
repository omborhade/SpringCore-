package com.jbk.MainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jbk.configuration.configuration;
import com.jbk.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(configuration.class);
		 Employee  emp = context.getBean(Employee.class);
		 System.out.println(emp);
		

	}

}
