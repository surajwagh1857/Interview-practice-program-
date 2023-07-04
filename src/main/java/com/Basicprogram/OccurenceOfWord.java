package com.Basicprogram;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurenceOfWord {
public static void main(String[] args) {
	//word count by normal way
	String str="Hello world";
	Map<String, Integer> map=new LinkedHashMap<String, Integer>();
	
	for(String word:str.split(" ")) {
		map.put(word, map.containsKey(word)?map.get(word)+1:1);
	}
	map.forEach((k,v)->{
		if(k!=" ") {
			System.out.println(k+" "+v);
		}
	});
	
	System.out.println("By java 8");
	//word count
	Map<Object,Long>wordcount=Arrays.stream(str.split(" ")).filter(a->a!=""&&a!=" ").collect(Collectors.groupingBy(a->a,LinkedHashMap::new ,Collectors.counting()));
	System.out.println(wordcount);
	
}
}
