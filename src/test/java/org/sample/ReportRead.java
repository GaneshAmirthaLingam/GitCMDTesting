package org.sample;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReportRead {
public static void main(String[] args) throws IOException, ParseException {
	
	//1. Mention the Path of the json file
	
	FileReader reader = new FileReader("C:\\Users\\ADMIN\\eclipse-workspace\\APIProject\\src\\test\\resources\\Employee.json");
	
	//2. Create the Object for JSONParser
	
	JSONParser jsonParser = new JSONParser();
	
	//3. Pass the json file to fetch values from json
	
	Object obj = jsonParser.parse(reader);
	
	//Convert to JSON Object
	
	JSONObject j = (JSONObject) obj;
	
	Object objName = j.get("name");
	
	System.out.println(objName);
	
	Object objEmail = j.get("email");
	
	System.out.println(objEmail);
	
	String name = (String) objName;
	System.out.println(name);
	
	//Address object in object
	
	Object objAddress = j.get("address");
	
	JSONObject jAddress = (JSONObject) objAddress;
	
	Object objStreet = jAddress.get("streetName");
	
	System.out.println(objStreet);
	
	//Single user
	
	
	
	
	
}
}
