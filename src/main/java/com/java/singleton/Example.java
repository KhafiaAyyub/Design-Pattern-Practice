package com.java.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
//		new Samosa();
//		Samosa samosa = Samosa.getSamosa();
//		System.out.println(samosa.hashCode());
//		
//		Samosa samosa1 = Samosa.getSamosa();
//		System.out.println(samosa1.hashCode());
//		
//		//Jalebi - easy
//		System.out.println(Jalebi.getJalebi().hashCode());
//		System.out.println(Jalebi.getJalebi().hashCode());
		
		Samosa s1 = Samosa.getSamosa();
		System.out.println(s1.hashCode());
		
		Constructor<Samosa> contructor = Samosa.class.getDeclaredConstructor();
		contructor.setAccessible(true);
		Samosa s2 = contructor.newInstance();
		System.out.println(s2.hashCode());
		
		
		
	}
	
}

//lazy intializatoion
