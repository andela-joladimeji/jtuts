package com.andela.tutorials;

import java.io.File;

public class DirectoryUtil {

	public static String getWorkingDirectory() {
		System.out.println(System.getProperty("user.dir"));
		return System.getProperty("user.dir");
	}

	public static void transverseDirectory(File directory) {
		System.out.println(directory);
		if (directory.isDirectory()) {
			String[] children = directory.list();
			for (int i = 0; i < children.length; i++) {
				transverseDirectory(new File(directory, children[i]));
			}
		}
	}

	public static void showRoots() {
		File[] roots = File.listRoots();
		for (int i = 0; i < roots.length; i++) {
			System.out.println(roots[i]);
		}
	}

}
