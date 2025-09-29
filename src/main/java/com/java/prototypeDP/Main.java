package com.java.prototypeDP;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.out.println("Creating Object using prototype ");
		
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp("165.345.4.5");
		networkConnection.loadVeryImportantData();
		
		System.out.println(networkConnection);
		
		

		//we want new object of network connection
//		NetworkConnection networkConnection2 = null;
		try {
			NetworkConnection networkConnection2  = (NetworkConnection) networkConnection.clone();
			NetworkConnection networkConnection3  = (NetworkConnection) networkConnection.clone();
			System.out.println(networkConnection); //obj1
			networkConnection.getDomains().remove(0);
			System.out.println(networkConnection); //obj1

			System.out.println(networkConnection2);  //obj2
			System.out.println(networkConnection3);  //obj3
			} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
