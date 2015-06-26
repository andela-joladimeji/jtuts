package com.andela.tutorials;

public class MethodUtil {

	public static void displayTypes(Object... objects) {
		for (int i = 0; i < objects.length; i++) {
			System.out.println(objects[i].getClass().getName());
		}
	}

}
