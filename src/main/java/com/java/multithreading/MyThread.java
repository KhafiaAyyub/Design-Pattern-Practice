package com.java.multithreading;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("Running....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1 = new MyThread();
		System.out.println(t1.getState());  //NEW
		t1.start();
		System.out.println(t1.getState()); //RUNNABLE
		
//		System.out.println(Thread.currentThread().getState());  //RUNNABLE - RUNNING ana chahiye
		
		Thread.sleep(100); //main method pause 
		System.out.println(t1.getState()); //TIMED_WAITING // jb run method sleep kr rha then Timed_waiting
		t1.join(); //main method is waiting for t1 to come
		System.out.println(t1.getState());
		
	}
	
	

}
