package com.java8;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class FilterNullfromMap {
public static void main(String[] args) {
	
	HashMap<Integer, String>hm=new HashMap<Integer, String>();
	hm.put(10, "suraj");
	hm.put(20, "komal");
	hm.put(null, "radha");
	hm.put(40, "rutuja");
	hm.put(50, null);
	
	System.out.println(hm);
	
	if (hm!= null) {
		hm.forEach((k, v) -> System.out.println(k+" "+v));
	}
	
	System.out.println("Checking Null");
	hm.forEach((k,v)->{
		if (k!=null && v!=null) {
			System.out.println(k+"   "+v);
		}
	});
}
}