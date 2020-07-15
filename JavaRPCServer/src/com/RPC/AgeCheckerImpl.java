package com.RPC;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.RPC.AgeChecker")
public class AgeCheckerImpl implements AgeChecker{
	String message = "";
	
	@Override
	public String checkAge(int age) {
		if(age<18) {
			message =  "You are a teenager!";
		}else{
			message =  "You are an adult!";
		}
		return message;
	}
}