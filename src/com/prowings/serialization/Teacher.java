package com.prowings.serialization;

import java.io.Serializable;

public class Teacher implements Serializable{

	int id;
	String name;
	String subject;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int id, String name, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
}
