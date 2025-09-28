package com.java.singleton;

import javax.management.RuntimeErrorException;

public class Samosa {
	
	private static Samosa samosa;
	
	//constructor call - object create
	private Samosa() {
		if(samosa !=null) {
			throw new RuntimeErrorException(null, "you..........");
		}
	}
	
	//Lazy way to creating single object - jb zarrorat hai tn create krna
	public static Samosa getSamosa() {
	//object of this class
//		Samosa samosa = new Samosa();
//		return samosa;
		//you put non-static in static variable
		if(samosa == null) {
			 samosa = new Samosa();
		}
		return samosa;	
	}

	
	

	


}

/// *
//* 1. Constructor private
//* 2/ pbject create with the help of method
//* 3. create field to store object is private
//*
//*/
//1. Reeflection API to break singleton pattern
//soln - > ifobject is there we will throw exception , from inside constructor
//2. use enum




