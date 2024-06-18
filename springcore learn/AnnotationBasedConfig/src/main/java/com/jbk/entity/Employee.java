package com.jbk.entity;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	int Eid;
	String Ename;
	int Esalary;

	
	  @Override public String toString() { return "Employee [Eid=" + Eid +
	 ", Ename=" + Ename + ", Esalary=" + Esalary + "]"; }
	 
	public Employee(int eid, String ename, int esalary) {
		super();
		Eid = eid;
		Ename = ename;
		Esalary = esalary;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getEsalary() {
		return Esalary;
	}
	public void setEsalary(int esalary) {
		Esalary = esalary;
	}
	public Employee(){
		
	}
}
