package com.java.prototypeDP;

public class NetworkConnection implements Cloneable{

	private String ip;
	private String impData;

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
		//it will take 5 min
		Thread.sleep(2000);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", impData=" + impData + "]";
	}
	
	






}
