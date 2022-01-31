package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import com.qmms.java.ReadFile;

public class ReadFileTest {

	String testInputFile = "testInputFile.txt";
	String testOutputFile = "testOutputFile.txt";
	
	public TemporaryFolder temporaryFolder = new TemporaryFolder();
	
	@Test
	public void readsText() {
		
		String[] expectedResult = {"test", "input", "file"};
		try {
			ReadFile.reader(testInputFile);
		} catch (IOException e) {
			System.err.println("Can't find the file" + e.getMessage());
		}

		assertEquals(Arrays.toString(expectedResult), Arrays.toString(ReadFile.splitLine));

		
	}
	

}
