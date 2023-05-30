package com.prowings.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomSerialization {

	public static void main(String[] args) {

		User usr = new User("1234", "Ram", "password");

		FileOutputStream file = null;
		ObjectOutputStream out = null;

		try {
			// Saving of object in a file
			file = new FileOutputStream("user.ser");
			out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(usr);
			System.out.println("object serialized successfully!!");
		} catch (Exception e) {
			System.out.println("exception while serializing the object!!    :  " + e.getMessage());
			e.printStackTrace();
		} finally {
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
