package com.andela.tutorials;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class MethodUtilTest {

	@Test
	public void testdisplayTypes(){
		MethodUtil.displayTypes(new String(), new Date(), new Integer(5));
	}


}
