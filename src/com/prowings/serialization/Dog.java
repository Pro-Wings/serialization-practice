package com.prowings.serialization;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {

	Dog(int i) {
		super(i);
		// TODO Auto-generated constructor stub
	}

	int j = 20;
	
//	Dog()
//	{
//		System.out.println("inside Dog no arg constructor");
//	}

	@Override
	public String toString() {
		return "Dog [j=" + j + ", i=" + i + "]";
	}

	
	
}
