package com.jbk.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jbk.entity.Employee;

public class MainClass {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		      Employee emp =  context.getBean(Employee.class);
		      System.out.println(emp);
		      

		      Employee emp2 =  context.getBean(Employee.class);
		      System.out.println(emp2);
	} 

}
