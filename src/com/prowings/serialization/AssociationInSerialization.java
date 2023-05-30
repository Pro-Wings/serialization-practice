package com.prowings.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AssociationInSerialization {
	
	public static void main(String[] args) {
		
		Street street = new Street(007, "MG Road");
		Address address = new Address(411033, "Pune", "India", street);
		Person p1 = new Person(123, "Ram", address);
		
		FileOutputStream file = null;
		ObjectOutputStream out = null;
		
		 try
	        {  
	            //Saving of object in a file
	            file = new FileOutputStream("person.ser");
	            out = new ObjectOutputStream(file);
	             
	            // Method for serialization of object
	            out.writeObject(p1);
	            System.out.println("object serialized successfully!!");
	        }
		 catch (Exception e) {
			 System.out.println("exception while serializing the object!!    :  "+e.getMessage());
			 e.printStackTrace();
		}
		 finally {
			 try {
				out.close();
				file.close();
			} catch (IOException e) {
				System.out.println("error while closing the resources");
				e.printStackTrace();
			}
		}

		
		
	}

}
