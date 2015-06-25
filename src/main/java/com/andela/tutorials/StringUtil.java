package com.andela.tutorials;

public class StringUtil {

	public static int compare(String valueOne, String valueTwo) {
		return valueOne.compareTo(valueTwo);
	}

	public static String reverseAndMute(String word) {
		// a, e, i, o, u
		word = word.replaceAll("[aeiouAEIOU]", "");

		StringBuilder testWord = new StringBuilder(word);
		return testWord.reverse().toString();
	}

	/**
	 * Split a string and snake case the split words. Example, jan-feb-mar will
	 * output JAN.feb.MAR
	 * 
	 * @param value
	 * @param delimiter
	 * @return
	 */
	public static String splitAndSnake(String value, String delimiter){
		
		String[] myValue = value.split(delimiter);
		String output = new String();
		
		// loop over the array to upper or lower
		// join the array with .
		for(int i= 0; i < myValue.length; i++){
			if (output.length() > 0)
				output += '.';
			if(i % 2 == 0)
				output += myValue[i].toUpperCase();
			else
				output += myValue[i].toLowerCase();
		}
		
		return output;
	}
}
