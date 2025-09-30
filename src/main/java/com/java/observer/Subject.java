package com.java.observer;

public interface Subject {
	//subscribed kr ske and unsubscribed kr ske
	
	
	void subscribe(Observer ob);
	void unsubscribe(Observer ob);
	void notifyChanges(String Title); // notify kr raha hoga
	
	
	
	

}
