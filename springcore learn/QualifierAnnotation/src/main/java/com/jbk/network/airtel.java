package com.jbk.network;

import org.springframework.stereotype.Component;

import com.jbk.utility.sim;
@Component
public class airtel implements sim{

	@Override
	public void callingNetwork() {
		// TODO Auto-generated method stub
		System.out.println("calling from airtel network");
	}

}
