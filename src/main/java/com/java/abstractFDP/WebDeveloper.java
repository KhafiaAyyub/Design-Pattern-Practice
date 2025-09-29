package com.java.abstractFDP;

public class WebDeveloper implements Employee{

	public int salary() {
		return 40000;
	}

	public String name() {
		System.out.println("I am web dev");
		return "WEB DEV";
	}

}
