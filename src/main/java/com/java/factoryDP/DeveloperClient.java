package com.java.factoryDP;

public class DeveloperClient {
	
	public static void main(String[] args) {
		
		//android
		Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
		System.out.println(employee);
		int Salary = employee.Salary();
		System.out.println("Salary: " + Salary);
		
		
		//web
		Employee employee1 = EmployeeFactory.getEmployee("WEB DEVELOPER");
//		System.out.println(employee);
//		int Salary = employee.Salary();
		System.out.println("Salary: " + employee1.Salary());
		
		
		
	}
	
	

}
