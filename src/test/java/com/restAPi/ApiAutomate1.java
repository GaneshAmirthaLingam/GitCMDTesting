package com.restAPi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ApiAutomate1 {
	
	static RequestSpecification reqSpec; //No need to create object
	
	public static void main(String[] args) {//classname.methodname using
		
		reqSpec = RestAssured.given(); //given is static method

		reqSpec = reqSpec.header("Content-Type", "application/json"); 
		
		///req type
		//Response response = reqSpec.get("https://reqres.in/api/users/2");

		///req body
		//reqSpec  = reqSpec.body("{\r\n" + 
		//		"    \"name\": \"Ganesh\",\r\n" + 
		//	"    \"job\": \"manager\"\r\n" + 
		// "}");
		
		///req type1 POST, PUT, GET, DELETE
		//Response response = reqSpec.put("https://reqres.in/api/users/2");
		
//		//reqSpec = reqSpec.body("{\r\n" + 
//				"    \"data\": {\r\n" + 
//				"        \"id\": 2,\r\n" + 
//				"        \"email\": \"janet.weaver@reqres.in\",\r\n" + 
//				"        \"first_name\": \"Janet\",\r\n" + 
//				"        \"last_name\": \"Weaver\",\r\n" + 
//				"        \"avatar\": \"https://reqres.in/img/faces/2-image.jpg\"\r\n" + 
//				"    },\r\n" + 
//				"    \"support\": {\r\n" + 
//				"        \"url\": \"https://reqres.in/#support-heading\",\r\n" + 
//				"        \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"\r\n" + 
//				"    }\r\n" + 
//				"}");
//		
		//Response response = reqSpec.get("https://reqres.in/api/users/2");
		
		Response response = reqSpec.delete("https://reqres.in/api/users/2");
				
				
				
				
//		status code
		int statusCode = response.statusCode();
		System.out.println(statusCode);		
		
		//Get Res Body
		ResponseBody body = response.getBody();
		
		//asString
		String string = body.asString();
       System.out.println(string);
       
       //asPrettyString
       String asPrettyString = body.asPrettyString();
       System.out.println("asPrettyString");		
		
		
		
		
		
	}

}
