package com.prowings.serialization;

import java.io.Serializable;

public class Student implements Serializable {
	
	int roll;
	String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	
}
