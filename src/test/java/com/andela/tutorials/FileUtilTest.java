package com.andela.tutorials;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void test() {
		try {
			FileUtil.createFileAndDisplayInfo();
			FileUtil.createTempFile();
			FileUtil.readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
	}

}
