package testcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class BalanceDetailsByCard {
  @Test
  public void getbalancedetails() {
	  
	  RestAssured.baseURI = "http://10.10.120.140:8080/fuelrewards/public/rest/v2/frnExcentus/retailers/10001/cards/6051459012915685710/balance";
	  RequestSpecification httprequest = RestAssured.given();
	  
	  
		httprequest.header("Content-Type", "application/x-www-form-urlencoded");
		httprequest.header("access_token", "244e5536-3863-4670-a943-f0523ebef48b");
	  
	  
	  Response responsemessage = httprequest.get("/details");
		
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
		
	  
	  
	  
	  
  }
}
