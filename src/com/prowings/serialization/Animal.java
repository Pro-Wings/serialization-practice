package com.prowings.serialization;

public class Animal {

	int i = 10;
	
//	Animal()
//	{
//		System.out.println("inside Animal no arg constructor");
//	}

	Animal(int i)
	{
		System.out.println("inside Animal 1 arg constructor");
	}

	
	
	
	@Override
	public String toString() {
		return "Animal [i=" + i + "]";
	}

	
	
}
