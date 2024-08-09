package com.tap.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write {
	
	
	public static void main(String[] args)  {
	
		String path = "C:\\Users\\Reddemma\\JavaProjects\\study";
		Scanner scan =new Scanner(System.in);
		 FileWriter writer=null;
		 FileReader reader=null;
		 

		 
		
		// 1.File file = new File(path);
		 try {
			 
			// 1.writer= new FileWriter(file,true);
			 writer= new FileWriter(path,true);
			
			String s1=scan.next();
			String s2=scan.next();
			String s3=scan.next();
			
			
			
			
			writer.write(s1+"\n" );
			writer.write(s2 +"\n");
			writer.write(s3 +"\n" );
			writer.append(s3);
			writer.flush();
			
			reader=new FileReader(path);
			char ar[]=new char[reader.read()];
			//System.out.println(reader.read(ar)); // gives the length of the string
			System.out.println(ar);
			
			
		} 
		 catch (IOException e) {
			
			e.printStackTrace();
		}
		 finally {
			 scan.close();
			 try {
				writer.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			 
			 
		 }
	}
}
