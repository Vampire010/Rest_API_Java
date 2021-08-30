package com.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Test01_Get 
{
	
	@Test
	public void getEmployee()
	{
		Response resp = RestAssured.get("https://reqres.in/api/users?page=2");
		
		
		System.out.println(resp.statusCode());
		
		//System.out.println(resp.asString());
		
		
		System.out.println(resp.getBody().asString());
		
		
		System.out.println(resp.statusLine());

		int statusCode = resp.getStatusCode();
		
		Assert.assertEquals(statusCode, 200);
		
		
	}

}
