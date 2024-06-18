package com.jbk.MainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jbk.entity.EAddress;
import com.jbk.entity.Employee;

public class MainClass2 {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml"); // this line will create IOC CONTAINER
			Employee emp=context.getBean("e2", Employee.class); 
		   System.out.println(emp);
			
		/*
		 * EAddress eadd= context.getBean("e3" , EAddress.class);
		 * System.out.println(eadd);
		 */
			
	}
}
