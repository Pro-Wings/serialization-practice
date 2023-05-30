package com.prowings.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomDeserializationUsingExternalizable {
	
	public static void main(String[] args) {
		
		
		try {
			 FileInputStream file = new FileInputStream("ext_user.ser");
	         
			 ObjectInputStream in = new ObjectInputStream(file);
	         
			 
			 ExternalizedUser deserializedUser = (ExternalizedUser) in.readObject();
	         
			 System.out.println(deserializedUser);
			 
		} catch (Exception e) {
			
			System.out.println("exception while deserializing stream... ");
			e.printStackTrace();
		}
		
	}

}
