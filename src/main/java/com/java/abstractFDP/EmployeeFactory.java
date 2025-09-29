package com.java.abstractFDP;

public class EmployeeFactory {
	
	//getEmployee
	public static Employee getEmployee(EmployeeAbstractFactory factory) {
		return factory.createEmployee();
		
	}
	

}
