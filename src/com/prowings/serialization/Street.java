package com.prowings.serialization;

import java.io.Serializable;

public class Street implements Serializable {
	
	int streetNumber;
	String name;
	

	public Street() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Street(int streetNumber, String name) {
		super();
		this.streetNumber = streetNumber;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Street [streetNumber=" + streetNumber + ", name=" + name + "]";
	}

	
	
}
