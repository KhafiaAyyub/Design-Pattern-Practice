package com.java.multithreading;

public class World implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(; ;) {
		System.out.println(Thread.currentThread().getName());
		}
		
//		super.run();
	}

}
