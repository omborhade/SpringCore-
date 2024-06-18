package com.jbk.mainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jbk.entity.Account;
import com.jbk.myconfiguration.myconfig;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new AnnotationConfigApplicationContext(myconfig.class);
		  Account ac =context.getBean(Account.class);
	// ac.diposite();
		ac.diposite1(5000.0);
		
		
		
		
		
	}

}
