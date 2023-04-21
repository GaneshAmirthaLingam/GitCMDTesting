package com.restAPi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class OMRBranchTask {

	static RequestSpecification reqSpec;
	public static void main(String[] args) {
		
		
		reqSpec = RestAssured.given();

		reqSpec = reqSpec.header("Content Type", "application/json");

		reqSpec = reqSpec.auth().preemptive().basic("aganesh777@gmail.com", "Naturejo@88");
		
		Response response = reqSpec.post("https://omrbranch.com/api/login");
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		ResponseBody body = response.getBody();

		String string = body.asString();

		String asPrettyString = body.asPrettyString();
		System.out.println(asPrettyString);		
		
	}
}
