package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qmms.java.MergeSort;

public class MergeSortTest {

 
    @Test
    public void shouldDoNothingWithEmptyArray() {
        String[] values = {};
 
        MergeSort.mergeSort(values);
 
        assertEquals(values.length, 0);
    }
 
    @Test
    public void shouldDoNothingWithOneElementArray() {
        String[] values = {"aaa"};
 
        MergeSort.mergeSort(values);
 
        assertArrayEquals(new String[] {"aaa"}, values);
    }
 
    @Test
    public void shouldSortValues() {
    	String[] values = {"ddd", "ccc", "bbb", "aaa"};
    	String[] expectedOrder = {"aaa","bbb","ccc","ddd"};
 
        MergeSort.mergeSort(values);
        assertArrayEquals(expectedOrder, values);
    }
}
