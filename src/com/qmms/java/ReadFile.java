package com.qmms.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFile {

	public static String[] splitLine = null;	

	// Reads the file and adds it to the array
	public static void reader(String inputFile) throws IOException {
		
		try {
			BufferedReader bufferedReader = new BufferedReader(
					                        new FileReader(inputFile));
			
			String inputLine = null;
						
			while((inputLine = bufferedReader.readLine()) != null) {
	
				System.out.println(inputLine);
											

				
				splitLine = inputLine.split(" ");
//				Test Output
//				System.out.println(Arrays.toString(splitLine));
			}
			
			bufferedReader.close();
			
			
			
		} catch (FileNotFoundException e) {
			System.err.println("Can't find the file" + e.getMessage());
		}
	}
				
	
}
