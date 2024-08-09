package com.tap.serailization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main2 {
	public static void main(String[] args) {
		String path="C:\\Users\\Reddemma\\JavaProjects\\Objects.txt";
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			 fis=new FileInputStream(path);
			 ois=new ObjectInputStream(fis);
			 Customer c=(Customer) ois.readObject();
			 System.out.println(c.getName());
			 System.out.println(c.getCrn());
			 System.out.println(c.getBalance());
			 
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
