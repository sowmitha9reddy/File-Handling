package com.tap.files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read {
    public static void main(String[] args) {
        String path = "C:\\Users\\Reddemma\\JavaProjects/data.txt";
        String path2 = "C:\\Users\\Reddemma\\JavaProjects/copydata.txt";
        
        FileReader reader = null;
        FileWriter writer=null;

        try {
            reader = new FileReader(path);
            writer=new FileWriter(path2);
            int c = reader.read();
            while (c != -1) {
            	writer.write(c); // to copy the code to another file and it stores character by charcter
            	
            	
                System.out.print((char) c); //it reads character by character
                c = reader.read();
                
            }
            writer.flush();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
