package base;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class ValidatePutCall {
	
	
	
  @Test
  public void Putrequest() {
	  
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
	  
	  
	  int statusCode = responsemessage.statusCode();
	  System.out.println("statusCode=====>"+statusCode);
	 Assert.assertEquals(200,statusCode);

	  
	  
	  String statusLine = responsemessage.statusLine();
	  System.out.println("Status Line=====>" +statusLine);
	  Assert.assertEquals("HTTP/1.1 200 OK", statusLine);
	  
	  
	  System.out.println(responsemessage.body().asString());
	  
	long response_time =  responsemessage.getTime();
	
	System.out.println(response_time);
	  
	  
	  
	  
	  

	  

	  
	  
	  
	  
	  
	  
	  
	  
  }
}
