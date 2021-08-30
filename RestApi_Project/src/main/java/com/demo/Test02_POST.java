package com.demo;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test02_POST 
{
	
	@Test
	public void addEmployee()
	{

		JSONObject rqst = new JSONObject();
		rqst.put("name", "Girish");
		rqst.put("job", "Sr.QA");
		
	

		System.out.println(rqst);
		//System.out.println(rqst.toString());

		given().body(rqst.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().statusCode(201 );

	}

}
