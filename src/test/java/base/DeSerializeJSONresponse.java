package base;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class DeSerializeJSONresponse {

	/*public void dserializ() {

		RestAssured.baseURI = "https://reqres.in/";

		RequestSpecification httprequest = RestAssured.given();

		httprequest.header("Content-Type", "application/json");

		JSONObject reqparameters = new JSONObject();

		reqparameters.put("name", "Thavamani");
		reqparameters.put("Age", "25");
		reqparameters.put("Country", "India");

		httprequest.body(reqparameters.toJSONString());

		Response responsemessage = httprequest.put("/api/users");

		int statusCode = responsemessage.statusCode();
		System.out.println("statusCode=====>" + statusCode);
		Assert.assertEquals(200, statusCode);

		String statusLine = responsemessage.statusLine();
		System.out.println("Status Line=====>" + statusLine);
		Assert.assertEquals("HTTP/1.1 200 OK", statusLine);

		System.out.println(responsemessage.body().asString());

	}*/
	
	
	
	public String name;
	
	
	public String  Age;

	
	
	public String  Country;
	
	public String  updatedAt;

	
	
	
	
}
