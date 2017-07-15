package com.codebind;

import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;

public class AppTest {

	FileInputStream file;
	String fileName;
	@Test
	public void test() throws InterruptedException {
		fail("Not yet implemented");
		
		Thread.sleep(1000);
		try {
			file = new FileInputStream(fileName);
			int x = (byte) file.read();
		}catch(IOException i){
			i.getStackTrace();
		}
	}

}
