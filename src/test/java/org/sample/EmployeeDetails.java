package org.sample;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Employee;

public class EmployeeDetails {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		File file = new File("C:\\Users\\ADMIN\\eclipse-workspace\\APIProject\\src\\test\\resources\\Employee1.json");
		
		Employee e1 = mapper.readValue(file, Employee.class);
		
		String name = e1.getName();
		System.out.println(name);

		String email = e1.getEmail();
		System.out.println(email);

		long phoneNo = e1.getPhoneNo();
		System.out.println(phoneNo);

		String address = e1.getAddress();
		System.out.println(address);
	
	}
}
