package com.jbk.entity;

public class EAddress {
      String Tadd;
      String Madd;
	@Override
	public String toString() {
		return "EAddress [Tadd=" + Tadd + ", Madd=" + Madd + "]";
	}
	public String getTadd() {
		return Tadd;
	}
	public void setTadd(String tadd) {
		Tadd = tadd;
	}
	public String getMadd() {
		return Madd;
	}
	public void setMadd(String madd) {
		Madd = madd;
	}
	public EAddress(String tadd, String madd) {
		super();
		Tadd = tadd;
		Madd = madd;
	}
	EAddress (){
		
	}
        
}
