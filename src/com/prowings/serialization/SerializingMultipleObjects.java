package com.prowings.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializingMultipleObjects {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Ram");
		Student s2 = new Student(20, "Sham");
		Teacher t1 = new Teacher(10, "AAA", "Maths");
		Teacher t2 = new Teacher(20, "BBB", "English");
		 try
	        {  
	            //Saving of object in a file
	            FileOutputStream file = new FileOutputStream("manyObjects.ser");
	            ObjectOutputStream out = new ObjectOutputStream(file);
	             
	            // Method for serialization of object
	            out.writeObject(s1);
	            out.writeObject(t1);
	            out.writeObject(s2);
	            out.writeObject(t2);
	            System.out.println("objects serialized successfully!!");
	        }
		 catch (Exception e) {
			 System.out.println("exception while serializing the objects!!    :  "+e.getMessage());
			 e.printStackTrace();
		}
	}

}
