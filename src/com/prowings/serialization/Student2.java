package com.prowings.serialization;

import java.io.Serializable;

public class Student2 implements Serializable {
	
	int roll;
//	transient final String name = "zzz"; //case1
	transient final String name; //case2
	int marks;
	static String schoolName = "ABC School";
	
	public Student2() {
		super();
		this.name = "zzzz"; //case2
	}


	public Student2(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student2 [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}

	
	
	
	
}
