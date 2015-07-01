package com.andela.tutorials;

import static org.junit.Assert.*;

import java.net.UnknownHostException;

import org.junit.Test;

public class NetworkUtilTest {

	@Test(expected = java.net.UnknownHostException.class)
	public void unknownHostNameTest() throws UnknownHostException {
		assertEquals("github.com", NetworkUtil.displayHostName("jumoke"));
	}

	@Test
	public void hostNameTest() {
		try {
			assertEquals("github.com",
					NetworkUtil.displayHostName("66.135.33.172"));
		} catch (Exception e) {
			fail("Hostname should be known");
		}
	}

	@Test
	public void pingServerTest() {
		assertTrue(NetworkUtil.pingHost("www.google.com"));
		assertFalse(NetworkUtil.pingHost("hostnameexample"));
	}
	
	@Test
	public void downloadWebpageTest(){
		assertNotNull(NetworkUtil.downloadWebPage("http://www.google.com"));
		
	}

}
