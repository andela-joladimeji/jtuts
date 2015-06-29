package com.andela.tutorials;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class ExceptionUtilTest {

	@Test
	public void dataValidityTest() {
		HashMap<String, Integer> testValue = new HashMap<String, Integer>();
		testValue.put("T2352", 1234);
		testValue.put("M452", 234);
		testValue.put("Testing", 5678);
		testValue.put("my value", 4);
				
		assertEquals("ok", ExceptionUtil.checkForInvalidData(testValue));
		
		HashMap<String, Integer> value = new HashMap<String, Integer>();
		value.put("ID", 0);
		
		assertEquals("zero", ExceptionUtil.checkForInvalidData(value));
	}

}
