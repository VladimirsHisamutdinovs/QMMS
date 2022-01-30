package com.qmms.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.Collator;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


// TODO: unit tests

public class Main {

	static String inputFile = "qmms.txt";
	static String outputFile = "sortedQmms.txt";
	
	public static List<String> lines = new ArrayList<String>();
	
	public static void main(String[] args) throws IOException {
		
		String[] splitLine = null;
			
		// Reads the file and adds it to the array
		try {
			BufferedReader bufferedReader = new BufferedReader(
					                        new FileReader(inputFile));
			
			String inputLine = null;
						
			while((inputLine = bufferedReader.readLine()) != null) {
	
				System.out.println(inputLine);
											
				lines.add(inputLine);
				
				splitLine = inputLine.toLowerCase().split(" ");
				System.out.println(Arrays.toString(splitLine));
			}
			
			bufferedReader.close();
			
			
			
		} catch (FileNotFoundException e) {
			System.err.println("Can't find the file" + e.getMessage());
		}
				
		//------------ Various ways of sorting ---------------//
		
		// Simple sort with Arrays class
		// Arrays.sort(splitLine);
		
		// Fancy way of sorting via Streams
       // splitLine = Stream.of(splitLine).sorted().toArray(String[]::new);
		
		// Custom merge sort
		MergeSort.mergeSort(splitLine);
		
		System.out.println("after sorting");
		System.out.println(Arrays.toString(splitLine));
		
		//-------------Writing to the file ------------------//
		
		// Writes the sorted array to the file
		
		try {
			PrintWriter printWriter = new PrintWriter(
									  new FileWriter(outputFile));
			// writes the file line by line
			for (String str: splitLine) {
				printWriter.write(str + " "); // String with new line + carriage return
				
			}
			System.out.println("Complete");
			printWriter.close();
		} catch (IOException e) {
			System.err.println("Something went wrong" + e.getMessage());
		}
		
		
} 
	
}
