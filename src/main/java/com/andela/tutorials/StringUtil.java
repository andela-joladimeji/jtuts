package com.andela.tutorials;

public class StringUtil {

	public static int compare(String valueOne, String valueTwo){
		return valueOne.compareTo(valueTwo);
	}
	
	public static String reverseAndMute(String word){
		// a, e, i, o, u
		word = word.replaceAll("[aeiouAEIOU]", "");
		
		StringBuilder testWord = new StringBuilder(word);
		return testWord.reverse().toString();
	}
	
}
 