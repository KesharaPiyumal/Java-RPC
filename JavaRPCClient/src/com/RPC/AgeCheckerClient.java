package com.RPC;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
 
public class AgeCheckerClient{
 	public static void main(String[] args) throws Exception {
 	URL url = new URL("http://localhost:7788/age/check?wsdl");
 
        //1st argument service URI, refer to wsdl document above
	    //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://RPC.com/", "AgeCheckerImplService");
 
        Service service = Service.create(url, qname);
        AgeChecker ageCheckerObj = service.getPort(AgeChecker.class);
 
        System.out.println(ageCheckerObj.checkAge(15));
        System.out.println(ageCheckerObj.checkAge(21));
        System.out.println(ageCheckerObj.checkAge(13));
 
    }
 
}