package com.prowings.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class InheritanceInDeserialization {
	
	public static void main(String[] args) {
		
		
		try {
			 FileInputStream file = new FileInputStream("dog.ser");
	         
			 ObjectInputStream in = new ObjectInputStream(file);
	         
			 
			 Dog deserializedDog = (Dog) in.readObject();
	         
			 
			 System.out.println(deserializedDog);
			 
		} catch (Exception e) {
			
			System.out.println("exception while deserializing stream... ");
			e.printStackTrace();
		}
		
	}

}
