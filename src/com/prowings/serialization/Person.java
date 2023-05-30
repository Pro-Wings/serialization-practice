package com.prowings.serialization;

import java.io.Serializable;

public class Person implements Serializable{
	
	int id;
	String name;
	Address address;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
