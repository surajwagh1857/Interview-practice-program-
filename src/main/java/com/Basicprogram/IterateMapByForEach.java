package com.Basicprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class IterateMapByForEach {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		 hm.put(10,"suraj");
		 hm.put(20,"komal");
		 hm.put(30,"sanjivanee");
		 hm.put(40,"akshay");
		 hm.put(50,"swapnil");
		
		Set<Entry<Integer, String>> set=hm.entrySet();
		 for(Entry<Integer,String>entry:set) {
			 System.out.println(entry.getKey()+"   "+entry.getValue());
		 }
	}

}
