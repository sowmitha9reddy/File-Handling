package com.tap.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferedWriterimp {
	

	public static void main(String[] args) {
		String path1="C:\\Users\\Reddemma\\JavaProjects\\employee.txt";
//	1.	FileWriter writer=null;
//		BufferedWriter writer2;
		Scanner scan=new Scanner(System.in);
		//int n=scan.nextInt();
		float n=scan.nextFloat();
		PrintWriter prW=null;
		
		
		try {
//		1.	writer=new FileWriter(path1,true);
//			writer2= new BufferedWriter(writer);
//			writer2.write("srinu" +"\n");
//			//gives and eeror writer2.write(n);
//			writer2.flush();
			
			prW=new PrintWriter(path1);
		//	prw.write(n);
			prW.print(n);
			prW.print(7);
			prW.println(true);
			prW.println("SIddhu");
			
			prW.flush();
			
			
		} 
		
		
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
