package loginsystem;

import java.io.*;
import java.util.Scanner;

/*
 * File reader and writer
 * 
 * Date: 051021
 * Author: Florian
 */

public class FileIO {
	
	// Method for writing to a file
	public static void output(String fileName, String fileOutput) {
		FileWriter out;
		File fileOut;
		try {
			fileOut = new File(fileName + ".txt");
			if(fileOut.createNewFile()) {
				System.out.println("created new file");
			}
			
			out = new FileWriter(fileOut);
			out.write(fileOutput);
			out.close();
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	// Input method for file
	public static String input(String fileName) {
		
		String output = "";
		File inputFile = new File(fileName + ".txt");
		
		// reading file
		try {
			
			Scanner s = new Scanner(inputFile);
			if(s.hasNextLine()) { output = s.nextLine(); }
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return output;
		
	}

	public static boolean exists(String name) {
		File inputFile = new File(name + ".txt");
		if(inputFile.isFile()) {
			return true;
		} else {
			return false;
		}
	}
	
}
