package com.demo;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test03_PUT 
{
	@Test
	public void updateEmployee() 
	{

		JSONObject request = new JSONObject();
		request.put("name", "Girish");
		request.put("job", "Lead");

		System.out.println(request);
		//System.out.println(request.toString());

		given().
		body(request.toJSONString()).
		when().
		put("https://reqres.in/api/users/2").
		then().statusCode(200);


	}

}
