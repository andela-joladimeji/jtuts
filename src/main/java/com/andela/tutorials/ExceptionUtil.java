package com.andela.tutorials;

import java.util.Map;

public class ExceptionUtil {

	public ExceptionUtil() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Loop over a Map and check if the 'ID' key is not equal to 0 If the 'ID'
	 * is equals to 0 we throw an Exception ; ZeroIdEntryException
	 * 
	 * @param validity
	 */
	public static String checkForInvalidData(Map<String, Integer> validity) {
		Integer value = validity.get("ID");

		if (value != null && value == 0) {
			System.out.println("This map's ID must not be equal to zero");
			try {
				throw new ZeroIdEntryException();
				// throw new UnmetConditionException("ID");
			} catch (ZeroIdEntryException e) {
				e.printStackTrace();
				return "zero";
			}
			/*
			 * catch (UnmetConditionException e){ e.printStackTrace(); return
			 * "zero"; }
			 */
		}

		return "ok";
	}
}

class ZeroIdEntryException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 81776459635847998L;

}

class UnmetConditionException extends Exception {

	public UnmetConditionException(String conditionName) {
		System.out.println("Unmet condition = " + conditionName);
	}
}