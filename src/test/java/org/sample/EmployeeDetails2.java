package org.sample;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Address;
import com.pojo.Employee;
import com.pojo.Employee2;

public class EmployeeDetails2 {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\APIProject\\src\\test\\resources\\Employee2.json");
		
		Employee2 e1 = mapper.readValue(file, Employee2.class);
		
		String name = e1.getName();
		System.out.println(name);

		String email = e1.getEmail();
		System.out.println(email);

		long phoneNo = e1.getPhoneNo();
		System.out.println(phoneNo);

		Employee2 e2 = mapper.readValue(file, Employee2.class);
		
		Address a = e2.getAddress();
		
		String streetName = a.getStreetName();
		System.out.println(streetName);	
		
		String state = a.getState();
		System.out.println(state);	
		
		int pinCode = a.getPinCode();
		System.out.println(pinCode);	
	
	}
}
