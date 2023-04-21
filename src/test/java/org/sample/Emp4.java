package org.sample;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Emp4 {

	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader reader = new FileReader("C:\\Users\\ADMIN\\eclipse-workspace\\APIProject\\src\\test\\resources\\Employee4.json");

	JSONParser jsonParser = new JSONParser();
	
	Object obj = jsonParser.parse(reader);
	
	JSONObject j = (JSONObject) obj;
	
	Object o1 = j.get("name");
	System.out.println(o1);
	
	Object o2 = j.get("email");
	System.out.println(o2);
	
	JSONObject j1 = (JSONObject) obj;
	
	Object objempD = j1.get("empDetails");
	JSONArray a = (JSONArray) objempD;
	Object O1 = a.get(0);
	
	
	
	for (int i = 0; i < a.size(); i++) {
		Object O = a.get(i);
		System.out.println(O);
		
	}
	
	
	
	}
}
