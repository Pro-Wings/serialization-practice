package com.prowings.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizedUser implements Externalizable {

	transient String userId;
	String userName;
	String password;

	public ExternalizedUser() {
		System.out.println("no arg constructor invoked!!");
	}

	public ExternalizedUser(String userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("writeExternal() invoked!!");
		
		out.writeObject(userId);
		out.writeObject(userName);
		out.writeObject(password);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("readExternal() invoked!!");
		userId = (String) in.readObject();
		userName = (String) in.readObject();
		password = (String) in.readObject();
	}

	
}
