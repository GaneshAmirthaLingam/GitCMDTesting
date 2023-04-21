package org.sample;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ListConcept {

	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader reader = new FileReader("C:\\Users\\ADMIN\\eclipse-workspace\\APIProject\\src\\test\\resources\\List.json");
		
		JSONParser jsonParser = new JSONParser();
		
		Object obj = jsonParser.parse(reader);
		
		JSONObject jo = (JSONObject)obj;
		
		Object objP = jo.get("page");
		System.out.println(objP);
		
		Object objP1 = jo.get("per_page");
		System.out.println(objP1);
		
		Object objT = jo.get("total");
		System.out.println(objT);
		
		Object objTP = jo.get("total_pages");
		System.out.println(objTP);
		
		Object objdata = jo.get("data");
		JSONArray objData = (JSONArray)objdata;
	System.out.println(objdata);
	
	}
	
}
