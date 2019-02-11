package base;

import java.sql.Timestamp;
import java.time.Instant;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Putcallvalidation {
	
	
	 @Test
	  public void Putrequest() {
		  
	        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	        
	        

		 
		 
		  RestAssured.baseURI="https://reqres.in/";
		  
		  RequestSpecification httprequest = RestAssured.given();

		  
		  
		  

		  //Define the values to be passed as  header
		  httprequest.header("Content-Type", "application/json");
		  
		  
		  //Create a JSON request with all input parameters
		  
		  JSONObject  reqparameters = new JSONObject();
		  
		  reqparameters.put("name", "Thavamani");
		  reqparameters.put("Age", "25");
		  reqparameters.put("Country", "India");
		  
		  // Add the JSON input to the Body of the request
	         
		  httprequest.body(reqparameters.toJSONString());
		  
		  
	       Response responsemessage = httprequest.put("/api/users");
	       
	        Instant instant = timestamp.toInstant();
	        
	        String string = instant.toString();

		  
		  
		  int statusCode = responsemessage.statusCode();
		  System.out.println("statusCode=====>"+statusCode);
		 Assert.assertEquals(200,statusCode);
		  
		  
		  String statusLine = responsemessage.statusLine();
		  System.out.println("Status Line=====>" +statusLine);
		  Assert.assertEquals("HTTP/1.1 200 OK", statusLine);
		  
		  
		  System.out.println(responsemessage.body().asString());
		  
		  //Serialization concept
		  
		  ResponseBody body = responsemessage.getBody();	
		  
		  
		  
		  DeSerializeJSONresponse responseee = body.as(DeSerializeJSONresponse.class);
		  
		  
		  org.testng.Assert.assertEquals("Thavamani", responseee.name,"Name Mismatch");
		  org.testng.Assert.assertEquals("India", responseee.Country);
		  org.testng.Assert.assertEquals("25", responseee.Age);
		  

        org.testng.Assert.assertTrue(string.contains("2019"));		  
		  
		  
		  
		  

} }
