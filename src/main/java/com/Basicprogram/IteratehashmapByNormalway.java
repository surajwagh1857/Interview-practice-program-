package com.Basicprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratehashmapByNormalway {
public static void main(String[] args) {
	HashMap<Integer, String> hm=new HashMap<Integer, String>();
	 hm.put(10,"suraj");
	 hm.put(20,"komal");
	 hm.put(30,"sanjivanee");
	 hm.put(40,"akshay");
	 hm.put(50,"swapnil");
	
	Set set=hm.entrySet();
	Iterator<Object> itr=set.iterator();
	while (itr.hasNext()) {
		Map.Entry<Integer,String>entry=(Entry<Integer, String>) itr.next();
		System.out.println(entry.getKey()+"    "+entry.getValue());
	}
	
}
}
