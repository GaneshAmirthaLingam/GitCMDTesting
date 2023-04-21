package com.restAPi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class APIAutomation {
	
	static RequestSpecification reqSpec;
	public static void main(String[] args) {
		
		// 1. Initialize Rest Assured Class
		
		 reqSpec = RestAssured.given();
		
		//2. Header
		
		 reqSpec = reqSpec.header("Content-Type", "application/json");
		 
		 //3. query Parameter
		 
		 reqSpec = reqSpec.queryParam("page", "2");
		
		//4. req type
		 
		 Response response = reqSpec.get("https://reqres.in/api/users");
		 
		 //5. status code
		 
		 int statusCode = response.getStatusCode();
		
		 System.out.println(statusCode);
		 
		 //Get Response Body
		 
		 ResponseBody body = response.getBody();

		 //asString
		 
		 String string = body.asString();

		 System.out.println(string);

		 String asPrettyString = body.asPrettyString();

		 System.out.println(asPrettyString);
		
		
		
		
		
	}

}
