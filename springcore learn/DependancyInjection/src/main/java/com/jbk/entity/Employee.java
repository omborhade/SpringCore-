package com.jbk.entity;

public class Employee {

	int id;
	String name;
	String mobileno;
	EAddress eadd;

	Employee() {

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobileno=" + mobileno + ", eadd=" + eadd + "]";
	}

	public Employee(int id, String name, String mobileno) {
		super();
		this.id = id;
		this.name = name;
		this.mobileno = mobileno;
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

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public EAddress getEadd() {
		return eadd;
	}

	public void setEadd(EAddress eadd) {
		this.eadd = eadd;
	}

}
