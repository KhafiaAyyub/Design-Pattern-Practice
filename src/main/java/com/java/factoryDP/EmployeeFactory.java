package com.java.factoryDP;

public class EmployeeFactory {
	
	//get the employee
	public static Employee getEmployee(String empType) {
		
		if(empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
			return (Employee) new AndroidDeveloper();
		} else if(empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {
			return (Employee) new WebDeveloper();
		} else {
			
		return null;
		}
	}
	

}
