package com.prowings.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializingMultipleObjects {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Ram");
		Teacher t1 = new Teacher(10, "AAA", "Maths");
		 try
	        {  
	            //Saving of object in a file
	            FileOutputStream file = new FileOutputStream("manyObjects.ser");
	            ObjectOutputStream out = new ObjectOutputStream(file);
	             
	            // Method for serialization of object
	            out.writeObject(s1);
	            out.writeObject(t1);
	            System.out.println("objects serialized successfully!!");
	        }
		 catch (Exception e) {
			 System.out.println("exception while serializing the objects!!    :  "+e.getMessage());
			 e.printStackTrace();
		}
	}

}
