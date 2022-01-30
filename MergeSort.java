package com.qmms.java;

public class MergeSort {
	
	// On Mergesort: https://stackabuse.com/merge-sort-in-java/
	
	public static void mergeSort(String[] line) {
		if (line.length >= 2) {
            String[] left = new String[line.length / 2];
            String[] right = new String[line.length-line.length / 2];

            for (int i = 0; i < left.length; i++)
            {
                left[i] = line[i];
            }
            for (int i = 0; i < right.length; i++)
            {
                right[i] = line[i + line.length / 2];
            }

            mergeSort(left);
            mergeSort(right);

            merge(line, left, right);
        }
	}
	
	public static void merge(String[] result, String[] left, String[] right) {
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length &&
                                 left[i1].compareToIgnoreCase(right[i2])<0)) {
                      result[i] = left[i1];
                      i1++;
                 } else {
                      result[i] = right[i2];
                      i2++;
                 }
            }
    }
}
