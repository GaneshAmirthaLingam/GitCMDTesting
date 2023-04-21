package org.sample;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SingleUserConcept {
	public static void main(String[] args) throws IOException, ParseException {
	
		FileReader reader = new FileReader("C:\\Users\\ADMIN\\eclipse-workspace\\APIProject\\src\\test\\resources\\SingleUser.json");
		
		JSONParser jsonParser = new JSONParser();
		
		Object obj = jsonParser.parse(reader);
		
		JSONObject j = (JSONObject)obj;
		
		Object objectData = j.get("data");

		JSONObject jData = (JSONObject)objectData;
		
		
		Object obj1 = jData.get("id");
		
		System.out.println(obj1);
		
		Object obj2= jData.get("email");
		
		System.out.println(obj2);
		
		Object obj3 = jData.get("first_name");
		
		System.out.println(obj3);
		
		Object obj4 = jData.get("last_name");
		
		System.out.println(obj4);
		
		Object obj5 = jData.get("avatar");
		
		System.out.println(obj5);
		
		Object objSupport = j.get("support");
		JSONObject jSupport = (JSONObject)objSupport;
		
		Object obj6 = jSupport.get("url");
		System.out.println(obj6);
		
		Object obj7 = jSupport.get("text");
		System.out.println(obj7);
		
		
		
		
		
				
		
	}

	
	
	
}
