package com.restAPi;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Sample extends BaseClass {

	@Test
	
	public void login() {
		
		addHeader("Content-Type", "application/json");
		
		basicAuth("aganesh777@gmail.com", "Naturejo@88");
		
		Response response = requestType("POST", "https://omrbranch.com/api/login");

		int statusCode = getStatusCode(response);
		
		System.out.println(statusCode);
		
		String bodyAsprettyString = getBodyAsprettyString(response);

		System.out.println(bodyAsprettyString);

	}
}
