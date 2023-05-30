package com.prowings.serialization;

import java.io.Serializable;

public class Address implements Serializable {
	
	int pin;
	String city;
	String country;
	Street street;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int pin, String city, String country) {
		super();
		this.pin = pin;
		this.city = city;
		this.country = country;
	}
	
	public Address(int pin, String city, String country, Street street) {
		super();
		this.pin = pin;
		this.city = city;
		this.country = country;
		this.street = street;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", country=" + country + ", street=" + street + "]";
	}


}
