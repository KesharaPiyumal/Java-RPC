package com.RPC;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
//Service End Point Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface AgeChecker{
 
	@WebMethod String checkAge(int age);
 
}