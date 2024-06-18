package com.jbk.MainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jbk.configuration.configuration;
import com.jbk.entity.person;

public class MainClass {
public static void main(String[] args) {
	
	ApplicationContext context =  new AnnotationConfigApplicationContext(configuration.class);
	
	person p =    context.getBean(person.class);
	
	p.getSim1().callingNetwork();
	p.getSim2().callingNetwork();
	//System.out.println(p);
}
}
