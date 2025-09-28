package com.java.multithreading;

public class MyThread1 extends Thread{

	@Override
	public void run() {
//		System.out.println("Thread is Running....");
//		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		MyThread1 t1 = new MyThread1();
		t1.start();
		t1.join();
		System.out.println("Hello");
	}
	
	//start run sleep join setPriority
	//Daemon thread - bg thread 
	
	
	
}
