package com.Basicprogram;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateWordCountUsingNormalway {

	public static void main(String[] args) {
		String str="this is suraj suraj is qa";

		Map<String , Integer>map=new LinkedHashMap<String, Integer>();
		for(String word:str.split(" ")) {
			map.put(word, map.containsKey(word)?map.get(word)+1:1);
		}
		map.forEach((k,v)->{if(k!=" ") {
			System.out.println(k+" "+v);
		}});
	}

}
