package com.tap.files;

import java.io.File;
import java.io.IOException;

public class Alpha {

	public static void main(String[] args)  {
		//String path="C:\\Users\\Public\\Documents\\MyFiles\\file.txt";
		//String path = "C:\\Users\\Reddemma\\JavaProjects\\employee.txt";
		String path = "C:\\Users\\Reddemma\\JavaProjects\\java";
		//String path = "C:\\Users\\Reddemma\\JavaProjects";
		//System.out.println(path);
		 File file = new File(path);
//		 try {
//	            // Check if the file already exists
//	            if (file.exists()) {
//	                System.out.println("File already exists.");
//	            } else {
//	                // Try to create the new file
//	                if (file.createNewFile()) {
//	                    System.out.println("File created successfully: " + file.getPath());
//	                } else {
//	                    System.out.println("File creation failed.");
//	                }
//	            }
//	        } catch (IOException e) {
//	            // Handle any potential IO exceptions
//	            System.err.println("An IOException occurred:");
//	            e.printStackTrace();
//	        }
////	       
//	        System.out.println("File Exists: " + file.exists());
//	        System.out.println("File exists: " + file.exists());
//	        System.out.println( file.canRead());
//	        System.out.println(file.canWrite());
//	        System.out.println(file.getName());
//	        System.out.println(file.getParent());
//	        System.out.println(file.getAbsolutePath());
//	        System.out.println(file.isFile());
//	        System.out.println(file.isDirectory());
//	        System.out.println(file.mkdir());
//	        System.out.println(file.list());
//	        try {
//				file.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	        
	        // to create a directory
	       // file.createNewFile();
		// file.mkdir();
//		 String[] names=file.list();
//		 for(String s:names) {
//			 System.out.println(s);
//		 }
		 file.delete();
		 
		 
		 
	        
        
	}

}
