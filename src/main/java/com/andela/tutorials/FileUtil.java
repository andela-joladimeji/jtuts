package com.andela.tutorials;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

	public static void createFileAndDisplayInfo() throws IOException {
		Boolean create = false;
		
		File createdFile = new File("myFile.txt");
		if (!createdFile.exists()) {
			create = createdFile.createNewFile();
		}
		
		// append text to the file
		BufferedWriter out = new BufferedWriter(new FileWriter(createdFile));
		out.write("debug = 1\n");
		out.close();
		
		// created or not
		// last modification date
		// read only?
		// size
		System.out.println(create);
		System.out.println(createdFile.lastModified());
		System.out.println(!createdFile.canWrite());
		System.out.println("The file size is "+createdFile.length());

	}
	
	public static void createTempFile() throws IOException{
		File temp = File.createTempFile("config-net", ".log");
		temp.deleteOnExit();
	}
	
	public static void readFile() throws IOException{
		BufferedReader in = new BufferedReader(new FileReader("myFile.txt"));
		System.out.println(in.readLine());
	}

}
