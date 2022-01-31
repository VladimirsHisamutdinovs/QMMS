package com.qmms.java;

import java.io.IOException;
import java.util.Arrays;


// TODO: unit tests

public class Main {

	static String inputFile = "qmms.txt";
	static String outputFile = "sortedQmms.txt";
	static String path = "/QMMS/";
	
	
	public static void main(String[] args) throws IOException {
		
		//------------ Reading from the file ---------------//
		ReadFile.reader(inputFile);				
		//------------ Various ways of sorting ---------------//
		
		// Simple sort with Arrays class
		// Arrays.sort(ReadWrite.splitLine);
		
		// Fancy way of sorting via Streams
        // splitLine = Stream.of(ReadWrite.splitLine).sorted().toArray(String[]::new);
		
		// Custom merge sort
		MergeSort.mergeSort(ReadFile.splitLine);
		
		// Console test
//		System.out.println("after sorting");
//		System.out.println(Arrays.toString(ReadFile.splitLine));
		
		//-------------Writing to the file ------------------//
		
		
		WriteFile.writeFile(path, outputFile);
} 
	
}
