package com.tap.serailization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		Customer c=new Customer("Sowmitha",1235475,300);
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		String path="C:\\Users\\Reddemma\\JavaProjects\\Objects.txt";
		try {
		    fos=new FileOutputStream(path);
		    oos = new ObjectOutputStream(fos);
		    oos.writeObject(c);
		    oos.flush();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
