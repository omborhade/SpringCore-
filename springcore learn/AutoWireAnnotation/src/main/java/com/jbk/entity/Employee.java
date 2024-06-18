package com.jbk.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
  int eid;
  String name;
  @Autowired
   country c;
  
  Employee(){
	  
  }
@Autowired
public Employee(@Value("1")  int eid, @Value("om")String name) {
	super();
	this.eid = eid;
	this.name = name;
}

public int getEid() {
	return eid;
}

public void setEid(int eid) {
	this.eid = eid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public country getC() {
	return c;
}

public void setC(country c) {
	this.c = c;
}

@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", c=" + c + "]";
}

}
