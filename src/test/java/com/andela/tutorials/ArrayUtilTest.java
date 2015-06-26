package com.andela.tutorials;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class ArrayUtilTest {

	@Test
	public void testDisplayCollections() {
		ArrayUtil.initCollections(new String[]{"a","b","c"});
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("G", 5);
		map.put("HA", 10);
		ArrayUtil.sumKeyAndValue(map);
	}
	
	@Test
	public void testSumFirstAndLast() {
		Set<Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(10);
		set.add(3);
		set.add(2);
		assertEquals(new Integer(12), ArrayUtil.sumFirstAndLast(set));
	}
	
	
}
