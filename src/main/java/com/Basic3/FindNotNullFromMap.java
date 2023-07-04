package com.Basic3;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FindNotNullFromMap {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new LinkedHashMap <Integer, String>();
		hm.put(10, "Suraj");
		hm.put(20, "Komal");
		hm.put(30, "Rutuja");
		hm.put(null, "Akash");
		hm.put(40, null);

		if (hm != null) {
			System.out.println(hm);
		}
		hm.forEach((k, v) -> {
			if (k != null && v != null) {
				System.out.println(k + "   " + v);
			}
		});
	}

}
