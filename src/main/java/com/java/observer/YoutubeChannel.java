package com.java.observer;

import java.util.List;

import java.util.ArrayList;

public class YoutubeChannel implements Subject{


	List<Observer> subscribers = new ArrayList<>();

	@Override
	public void subscribe(Observer ob) {
		this.subscribers.add(ob);

	}

	@Override
	public void unsubscribe(Observer ob) {
		this.subscribers.remove(ob);
	}

	@Override
	public void notifyChanges(String Title) {
		for(Observer ob : this.subscribers) {
			ob.notified(Title);
		}
		
	}


}
