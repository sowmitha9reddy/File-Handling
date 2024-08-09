package com.tap.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class TwoFileReading {

	

	public static void main(String[] args) {
	String path1="C:\\Users\\Reddemma\\JavaProjects\\employee.txt";
	String path2="C:\\Users\\Reddemma\\JavaProjects\\phoneNumber.txt";
	String path3="C:\\Users\\Reddemma\\JavaProjects\\phonebook.txt";
	FileReader fr1=null;
	BufferedReader br1=null;
	FileReader fr2=null;
	BufferedReader br2=null;
	FileWriter writer=null;
	
	
	try {
		fr1=new FileReader(path1);
		br1=new BufferedReader(fr1);
		fr2=new FileReader(path2);
		br2=new BufferedReader(fr2);
		writer=new FileWriter(path3);
		
		String name=br1.readLine();
		String phone=br2.readLine();
		while(name!=null && phone!=null) {
			
			System.out.println(name +":" +phone);
			writer.write(name +":"+phone +"\n");
			 name=br1.readLine();
			 phone=br2.readLine();
		}
		writer.flush();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
