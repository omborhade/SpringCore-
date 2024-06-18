package com.jbk.entity;

public class Employee {
 int id;
 String name;
 
String phno;

 Employee(){
	 
 }
public Employee(int id, String name, String phno) {
	super();
	this.id = id;
	this.name = name;
	this.phno = phno;
}


  @Override public String toString() { return "Employee [id=" + id + ", name="
  + name + ", phno=" + phno + "]"; }
 
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
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
 
}
