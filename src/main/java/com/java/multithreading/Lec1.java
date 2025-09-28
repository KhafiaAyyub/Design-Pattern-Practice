package com.java.multithreading;

public class Lec1 {

	
	public static void main(String[] args) {
//		System.out.println("Hello, World");
//		System.out.println(Thread.currentThread().getName());
		
		// extend thread class
//		World world = new World();   //NEW
//		world.start();        
		
		
		//implement runnable interface
		World world = new World();
		Thread t1 = new Thread(world);
		t1.start();
		
		
		
		
		for(; ;) {
			System.out.println(Thread.currentThread().getName());
		}
		
		
		
		
		
	}
	
	
}
