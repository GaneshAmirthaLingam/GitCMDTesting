package com.restAPi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ApiAutomate2 {

	static RequestSpecification reqSpec;
	public static void main(String[] args) {
		
		// 1. Initialize RestAssured Class
		reqSpec = RestAssured.given();

		// 2. Header
		reqSpec  = reqSpec.header("Content-Type", "application/json");

		// 3. query parameter 
		//reqSpec = reqSpec.queryParam("page", "2");
		
		// 3. req body
		
		reqSpec = reqSpec.body("{\r\n" + 
				"    \"data\": {\r\n" + 
				"        \"id\": 2,\r\n" + 
				"        \"email\": \"janet.weaver@reqres.in\",\r\n" + 
				"        \"first_name\": \"Janet\",\r\n" + 
				"        \"last_name\": \"Weaver\",\r\n" + 
				"        \"avatar\": \"https://reqres.in/img/faces/2-image.jpg\"\r\n" + 
				"    },\r\n" + 
				"    \"support\": {\r\n" + 
				"        \"url\": \"https://reqres.in/#support-heading\",\r\n" + 
				"        \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"\r\n" + 
				"    }\r\n" + 
				"}");

		// 4. req type POST
		Response response = reqSpec.post("https://reqres.in/api/users");
		
		
		int statusCode = response.getStatusCode();
        System.out.println(statusCode);
        
        ResponseBody body = response.getBody();

        String string = body.asString();

        String asPrettyString = body.asPrettyString();

        System.out.println(asPrettyString);
		
		
	}
	
}
