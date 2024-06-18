package com.jbk.utility;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class Message {
	/*
	 * @Pointcut("execution (public void diposite())") public void sentsms() {
	 * 
	 * }
	 * 
	 * @After("sentsms()") public void printsms() {
	 * System.out.println("thank you "); }
	 */
       
       @Pointcut("execution (public void diposite1(..))")
   	public void sentsms1() {
   		
   	}
       @After("sentsms1()")
       public void printsms(JoinPoint jt) {
    	   System.out.println("thank you  your amount is "+ Arrays.toString(jt.getArgs()));
       }
}
