package base;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.util.Asserts;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import groovyjarjarasm.asm.commons.Method;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class ValidateGetCall {
	
	 
	@Test
	public void getapiresponse() {
		
		
		
		
		RestAssured.baseURI = "https://reqres.in/api/users";
		RequestSpecification httprequest = RestAssured.given();
		
		//Response responsemessage = httprequest.request(io.restassured.http.Method.GET,"/2");
		
		Response responsemessage = httprequest.get("/2");
		
		int statusCode = responsemessage.statusCode();
		System.out.println("Status Code----->" +statusCode);
		Assert.assertEquals(statusCode, 200);
		
		
		
		
		String statusLine = responsemessage.statusLine();
		System.out.println("Status Line--------->"+statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
		
		
		String respnsebody = responsemessage.getBody().asString();
		
		System.out.println("=============ResponseMessage================");
		System.out.println(respnsebody);
		
		
		
		/*String header = responsemessage.header(respnsebody);
		System.out.println("Header----->"+header);*/
		
		
		
		Headers allheaders = responsemessage.headers();

		
		
		for (Header header : allheaders) {
			
			
			System.out.println("key: " +header.getName() +" value: " +header.getValue() );
		}
		
		//COde to read all the nodes from the API response
		
		 
		
		
		
		
		
		
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	

	
}
