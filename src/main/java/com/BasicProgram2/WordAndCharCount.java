package com.BasicProgram2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordAndCharCount {
public static void main(String[] args) {
	
	String str="This is suraj suraj is devloper";
	
	Map<String, Integer>map=new LinkedHashMap<String, Integer>();
	
	for(String word:str.split(" ")) {
		map.put(word, map.containsKey(word)?map.get(word)+1:1);
	}
	map.forEach((k,v)->{
		if(k!=" ") {
			System.out.println(k+"  "+v);
		}
	});
	
	//By using java8...
	Map<Object,Long>duplicateword=Arrays.stream(str.split(" ")).filter(a->a!=""&& a!=" ").collect(Collectors.groupingBy(a->a,LinkedHashMap::new,Collectors.counting()));
	System.out.println(duplicateword);
}
}
