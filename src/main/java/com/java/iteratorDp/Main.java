package com.java.iteratorDp;

public class Main {
	public static void main(String[] args) {
		
		UserManagement userManagement = new UserManagement();
		
		userManagement.addUser(new User("khafia", "14"));
		userManagement.addUser(new User("Qwerty", "11"));
		
		MyIterator myIterator = userManagement.getIterator();
		while(myIterator.hasNext()) {
			User user = (User) myIterator.next();
			System.out.println(user.getName());
		}
	}
	
	

}
