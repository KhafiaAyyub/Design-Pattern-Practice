package com.java.prototypeDP;

import java.util.ArrayList;
import java.util.List;


public class NetworkConnection implements Cloneable{

	private String ip;
	private String impData;
	//for deep copy 
	//one more object 
	private List<String> domains = new ArrayList();
	

	public List<String> getDomains() {
		return domains;
	}
	public void setDomains(List<String> domains) {
		this.domains = domains;
	}
	public String getIp() {
		return ip;
	}
	public String getImpData() {
		return impData;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public void setImpData(String impData) {
		this.impData = impData;
	}

	public void loadVeryImportantData() throws InterruptedException {
		this.impData = "very very imp. Data ";
		
		domains.add("www.qwerty.com");
		domains.add("www.google.com");
		domains.add("www.zoo.com");
		
		//it will take 5 min
		Thread.sleep(2000);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//for deep copy
		//logic for cloning
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp(this.getIp());
		networkConnection.setImpData(this.getImpData());
		
		for(String d:this.getDomains()) {
			networkConnection.getDomains().add(d);
		}
		
		return networkConnection;
//		return super.clone();
	}
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", impData=" + impData + ", domains=" + domains + "]";
	}

	
	
	






}
