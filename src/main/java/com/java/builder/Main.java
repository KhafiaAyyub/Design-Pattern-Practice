package com.java.builder;

public class Main {
	
	public static void main(String[] args) {
		User user = new User.UserBuilder()
				.setEmailId("khakha@gmail.com")
				.setUserId("USER%24")
				.setUserName("asdfgh")
				.build();
		
		System.out.println(user);
		
		
		
		
		User user1 = User.UserBuilder.builder()
				.setEmailId("fghj@gmail.com")
				.setUserId("Ugfhj%24")
				.setUserName("fgh")
				.build();
		
		System.out.println(user1);
		
		
	}

}
