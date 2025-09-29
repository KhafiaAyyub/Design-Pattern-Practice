package com.java.abstractFDP;

public class AndroidDevFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		return new AndoirdDeveloper();
	}

}
