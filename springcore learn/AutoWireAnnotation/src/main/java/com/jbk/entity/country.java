package com.jbk.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class country {
 int cid;
 String name ;
 
 country(){
	 
 }
public country(int cid, String name) {
	super();
	this.cid = cid;
	this.name = name;
}
@Override
public String toString() {
	return "country [cid=" + cid + ", name=" + name + "]";
}
public int getCid() {
	return cid;
}
@Autowired
public void setCid(@Value("1") int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
@Autowired
public void setName( @Value("india") String name) {
	this.name = name;
}
 
}
