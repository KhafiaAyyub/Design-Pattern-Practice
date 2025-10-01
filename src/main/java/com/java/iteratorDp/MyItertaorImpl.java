package com.java.iteratorDp;

import java.util.ArrayList;
import java.util.List;

public class MyItertaorImpl implements MyIterator {
	private List<User> list;
	private int length;
	private int position = 0;

	public MyItertaorImpl(ArrayList<User> userList) {
		// TODO Auto-generated constructor stub
	}

	public MyIteratorImpl(List<User> list) {
		this.list = list;
		this.length=length;
	}

	@Override
	public boolean hasNext() {
		if(position >= length ) {
			return false;
		}else {
			return true;	
		}
	}

	@Override
	public Object next() {
			//pointer positon increase
		User user = list.get(position);
		position +=1;
		return user;
	}


}
