package com.jbk.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.jbk.utility.sim;

@Component
public class person {
    String name;
    int age;

	
	 @Autowired
	 @Qualifier("jio")
	 sim sim1;
	 
	 @Autowired
	 @Qualifier("airtel") 
	 sim sim2;
	 
    person(){
    	
    }

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}

	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public sim getSim1() {
		return sim1;
	}

	public void setSim1(sim sim1) {
		this.sim1 = sim1;
	}

	public sim getSim2() {
		return sim2;
	}

	public void setSim2(sim sim2) {
		this.sim2 = sim2;
	}
	
    
}