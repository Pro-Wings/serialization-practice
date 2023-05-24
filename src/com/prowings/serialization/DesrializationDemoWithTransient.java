package com.prowings.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DesrializationDemoWithTransient {
	
	public static void main(String[] args) {

		try {
			 FileInputStream file = new FileInputStream("transient_student.ser");
	         
			 ObjectInputStream in = new ObjectInputStream(file);
	         
			 
			 Student2 deserializedStd = (Student2) in.readObject();
	         
			 
			 System.out.println(deserializedStd);
			 System.out.println(deserializedStd.schoolName);
			 
		} catch (Exception e) {
			
			System.out.println("exception while deserializing stream... ");
			e.printStackTrace();
		}
		
		
	}

}
