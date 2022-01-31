package test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import com.qmms.java.WriteFile;

public class WriteFileTest {

	public String testOutputFile = "testOutputFile.txt";
	public String path = "/QMMS/";
	public String fullPath = path + testOutputFile;
	
	
	
	@Test
    public void writesContentToFile() throws IOException {
       
        // act
        WriteFile.writeFile(path, testOutputFile);

        // TODO: proper content/extension test
        // assert
//        assertThat("test", testOutputFile)
//                .hasContent("test")
//                .hasExtension("txt")
//                ;
//   

 
   
}
