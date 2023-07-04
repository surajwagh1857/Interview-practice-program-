package com.Basic3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapByForEach {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(10, "suraj");
		hm.put(20, "komal");
		hm.put(30, "sanjivanee");
		hm.put(40, "akshay");
		hm.put(50, "swapnil");

		Set<Map.Entry<Integer, String>> set = hm.entrySet();

		for (Map.Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey() + "   " + entry.getValue());
		}

	}
}
