package com.java.abstractFDP;

public class Client {

	public static void main(String[] args) {

		//android
		Employee e1 =  EmployeeFactory.getEmployee(new AndroidDevFactory());  //will give factory
		e1.name();


		//android
		Employee e2 =  EmployeeFactory.getEmployee(new WebDevFactory());  //will give factory
		e2.name();

		//manager
		Employee m1 = EmployeeFactory.getEmployee(new ManagerFactory());
		m1.name();
		

	}


}
