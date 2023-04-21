package com.restAPi;

import org.codehaus.groovy.ast.stmt.CaseStatement;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	
	RequestSpecification reqSpec;
	
	Response response;
	
	public void addHeader(String Key, String Value) {
		reqSpec = RestAssured.given().header(Key, Value);

	}
	
	public void queryParam(String Key, String Value) {
		reqSpec = reqSpec.queryParam(Key, Value);

	}
	
	public void pathParam(String Key, String Value) {
		reqSpec = reqSpec.pathParam(Key, Value);

	}
	
	public void basicAuth(String userName, String password) {
		reqSpec = reqSpec.auth().preemptive().basic(userName, password);

	}
	
	public void addBody(String body) {
		reqSpec = reqSpec.body(body);

	}
	
	public Response requestType(String reqType, String endpoint) {
		
switch (reqType) {
case "GET":
	response = reqSpec.get(endpoint);
	
	break;
	
case "POST":
	response = reqSpec.post(endpoint);
	
	break;
	
case "PUT":
	response = reqSpec.put(endpoint);
	
	break;
	
case "DELETE":
	response = reqSpec.delete(endpoint);

break;

default:
break;

}
return response;
		
}		
		
	public int getStatusCode(Response response) {
	
		int statusCode = response.getStatusCode();
		return statusCode;
		
	}
		
	public ResponseBody getBody(Response response) {
		
		ResponseBody body = response.getBody();
		return body;

	}	
		
	public String getBodyAsString(Response response) {
	
		String asString = getBody(response).asString();
		return asString;
	}	
	
	public String getBodyAsprettyString(Response response) {
		
		String jsonFormat = getBody(response).asPrettyString();
		return jsonFormat;
	}
	
	
}		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


