package com.prowings.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DesrializationDemo1 {
	
	public static void main(String[] args) {

		try {
			 FileInputStream file = new FileInputStream("student.ser");
	         
			 ObjectInputStream in = new ObjectInputStream(file);
	         
			 
			 Student deserializedStd = (Student) in.readObject();
	         
			 
			 System.out.println(deserializedStd);
			 
		} catch (Exception e) {
			
			System.out.println("exception while deserializing stream... ");
			e.printStackTrace();
		}
		
		
	}

}
