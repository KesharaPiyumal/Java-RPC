package com.RPC;
import javax.xml.ws.Endpoint;

//End point publisher
public class ServiceAsPublisher{
	
	public static void main(String[] args) {
		System.out.println("Listening in port 7788...");
	   Endpoint.publish("http://localhost:7788/age/check", new AgeCheckerImpl());
    }
 
}