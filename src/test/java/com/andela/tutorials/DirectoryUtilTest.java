package com.andela.tutorials;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class DirectoryUtilTest {

	@Test
	public void directoryTest() {
		DirectoryUtil.transverseDirectory(new File(DirectoryUtil
				.getWorkingDirectory()));
		DirectoryUtil.showRoots();
	}

}
