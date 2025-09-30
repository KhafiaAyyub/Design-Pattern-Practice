package com.java.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		YoutubeChannel channel = new YoutubeChannel();
		
		Subscriber aman = new Subscriber("Aman");
		Subscriber Raman = new Subscriber("Raman");
		channel.subscribe(aman);
		channel.subscribe(Raman);
		
		channel.notifyChanges("Learn DP "); ///new video uploaded notified 
		channel.notifyChanges("New DSA "); ///new video uploaded notified 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("Press 1 to upload ");
			System.out.println("Press 2 to create new subscriber");
			System.out.println("Press 3 to exit");
			
			int c = Integer.parseInt(br.readLine());
			if(c==1) {
				//upload new video
				System.out.println("Enter video title : ");
				String videoTitle = br.readLine();
				channel.notifyChanges(videoTitle);
			} else if(c==2) {
				//create new subscriber
				System.out.println("Enter name of Subscriber: ");
				String subsName = br.readLine();
				Subscriber subscriber3 = new Subscriber(subsName);
				channel.subscribe(subscriber3);
			} else if(c==3) {
				//exit
				System.out.println("Thank you for using app");
			} else {
				//wrong i/p
				System.out.println("Wrong Input");

			}
			
			
		}
		
		
		
	}
	

}
