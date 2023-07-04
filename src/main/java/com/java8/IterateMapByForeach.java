package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IterateMapByForeach {
	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<Integer, String>();
		map.put(10, "suraj");
		map.put(20, "komal");
		map.put(30, "swapnali");
		map.put(40, "mahesh");
		map.put(50, "Dnynesh");
		
		System.out.println("Interating map by using normal way.....!!!!");
		Set set=map.entrySet();

		for (Map.Entry<Integer, String> e: map.entrySet()) {
			System.out.println(e.getKey()+"  "+e.getValue());
		}
		
		System.out.println("Interating map by using Java8 way.....!!!!");
		map.forEach((k,v)->System.out.println(k+"    "+v));
		
	}
}
