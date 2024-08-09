package com.tap.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EffiecentReadingWay {
  public static void main(String[] args) {
	  String path = "C:\\Users\\Reddemma\\JavaProjects/file (2).txt";
	  String path2 = "C:\\Users\\Reddemma\\JavaProjects/newfile (2).txt";
	  FileReader reader=null;
	  FileWriter writer=null;
		BufferedReader reader2=null;
		int count=0;
		int charSum=0;
	  try {
		reader=new FileReader(path);
		writer=new FileWriter(path2);
		
	   reader2 = new BufferedReader(reader);
	   String line=reader2.readLine();
	   while(line!=null) {
		   System.out.println(line);
		   int l=line.length();
		    charSum+=l;
		    count++;
		   
		    line=reader2.readLine();
			  
		  
	   }
	   System.out.println("No.of Lines: "+count);
	  System.out.println("No.of characters in file: "+charSum);
	}
	  catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
