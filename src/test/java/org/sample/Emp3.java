package org.sample;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Emp3 {

	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader reader = new FileReader("C:\\Users\\ADMIN\\eclipse-workspace\\APIProject\\src\\test\\resources\\Employee3.json");
		
		JSONParser jsonParser = new JSONParser();
		
		Object obj = jsonParser.parse(reader);
		
		JSONObject j = (JSONObject) obj;
		
		Object objname = j.get("name");
		System.out.println(objname);
		
		Object objemail = j.get("email");
		System.out.println(objemail);

		Object objCourses = j.get("Courses");
		JSONArray a = (JSONArray) objCourses;
		Object o1 = a.get(0);
		
		System.out.println(o1);
		
		Object o2 = a.get(01);
		System.out.println(o2);
		
		Object o3 = a.get(02);
		System.out.println(o3);
		
		for (int i = 0; i < a.size(); i++) {
			Object o = a.get(i);
			System.out.println(o);
		}
		
	
	
	}
	
}
