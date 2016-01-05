package com.andela.tutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ArrayUtil {

	public ArrayUtil() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method creates an ArrayList, a LinkedSet, a HashSet and a HashMap
	 * 
	 * @param array
	 */
	public static void initCollections(String[] array) {
		List<String> a = new ArrayList<String>();
		List<String> l = new LinkedList<String>();
		Set<String> h = new HashSet<String>();
		Map<Integer, String> m = new HashMap<Integer, String>();

		for (int i = 0; i < array.length; i++) {
			a.add(array[i]);
			l.add(array[i]);
			h.add(array[i]);
			m.put(new Integer(i), array[i]);
		}

		System.out.println("ArrayList => " + a);
		System.out.println("LinkedSet => " + l);
		System.out.println("Hashet    => " + h);
		System.out.println("HashMap   => " + m);

	}

	public static HashMap<Integer, String> sumKeyAndValue(
			Map<String, Integer> map) {
		Iterator i = map.entrySet().iterator();
		String output = new String();
		Integer summed = new Integer(0);

		while (i.hasNext()) {
			Map.Entry entry = (Map.Entry) i.next();
			output += entry.getKey();
			summed = Integer.sum(summed, (Integer) entry.getValue());
		}

		Map m = new HashMap<String, Integer>();
		m.put(summed, output);
		System.out.println("Old hashmap =>" + map);
		System.out.println("New hashmap =>" + m);
		return null;
	}

	public static Integer sumFirstAndLast(Set<Integer> set) {
		TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
		return Integer.sum(sortedSet.first(), sortedSet.last());
	}

	public static LinkedList convertToLinkedList(List list) {
		return new LinkedList(list);
	}

	public static HashMap convertToHashamp(Map map) {
		return new HashMap(map);
	}

	public static HashMap<String, Object> convertFromArrayList(List<Object> list) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		for (Object obj : list) {
			// process conversion
			map.put(obj.toString(), obj);
		}
		return map;
	}

	public static List convertFromHashMap(HashMap map) {
		return new ArrayList(map.values());
	}

	public static List listFromArray(String[] array) {
		return new ArrayList<String>(Arrays.asList(array));
	}

	/*
	 * public static reverse(ArrayList[] value){
	 * 
	 * }
	 */

}
