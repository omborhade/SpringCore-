package com.jbk.entity;

import org.springframework.stereotype.Component;

@Component
public class Account {
	int id;
	String name;
	
	
	
	public void diposite() {
		System.out.println("amount deposited succesfully");
	}
	
	public void diposite1(double amount) {
		System.out.println("amount deposited succesfully"+ amount);
	}
	Account(){
		
	}
	

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
