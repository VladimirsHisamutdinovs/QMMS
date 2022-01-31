package com.qmms.java;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class WriteFile {
	
	// Writes the sorted array to the file
	public static void writeFile(String path, String outputFile) throws IOException {
	

		
	try {
		PrintWriter printWriter = new PrintWriter(
								  new FileWriter(outputFile));
		// writes the file line by line
		for (String str: ReadFile.splitLine) {
			printWriter.write(str + " "); // String with new line + carriage return
			
		}
		System.out.println("Complete");
		printWriter.close();
	} catch (IOException e) {
		System.err.println("Something went wrong" + e.getMessage());
	}
	
}
}
