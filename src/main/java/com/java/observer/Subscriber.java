package com.java.observer;

public class Subscriber implements Observer{

	String name;

	public Subscriber(String name) {
		this.name = name;
	}


	@Override
	public void notified(String Title) {

		System.out.println(" Helloooo "+this.name +" New video uploaded...."+Title);
	}

}
