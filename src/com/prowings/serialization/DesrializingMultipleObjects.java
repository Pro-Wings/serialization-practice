package com.prowings.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DesrializingMultipleObjects {
	
	public static void main(String[] args) {

		try {
			 FileInputStream file = new FileInputStream("manyObjects.ser");
			 ObjectInputStream in = new ObjectInputStream(file);

             while(in.available()==0){
                 Object o = in.readObject();
             	if(o instanceof Teacher)
             	{
             		Teacher t = (Teacher) o;
             		System.out.println(t);
             		break;
             	}
             }
             System.out.println("out of while");
			 
		} catch (Exception e) {
			
			System.out.println("exception while deserializing stream... ");
			e.printStackTrace();
		}
		
		
	}

}
