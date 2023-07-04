package com.Basic3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.probles.java8.Person;

public class HashMapBYNormway {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(10, "suraj");
		hm.put(20, "komal");
		hm.put(30, "sanjivanee");
		hm.put(40, "akshay");
		hm.put(50, "swapnil");

		Set set = hm.entrySet();
		Iterator<Person> itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> e1 = (Entry<Integer, String>) itr.next();
			System.out.println(e1.getKey() + "   " + e1.getValue());
		}

	}

}
