package com.probles.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurancrOfWord {
public static void main(String[] args) {
	
	System.out.println("Using normal way we find occorance of words...");
	String s="Hello world";
	
	Map<String, Integer>map=new LinkedHashMap();
	
	for (String word :s.split(" ")) {
		map.put(word, map.containsKey(word)?map.get(word)+1:1);
		
	}
	map.forEach((k,v)->{
		if (k!=" ") {
			System.out.println(k+" "+v);
		}
	});
	 System.out.println("using java8....!!");
	//word count
	Map<Object, Long>wordcount=Arrays.stream(s.split(" ")).filter(X->X!=" "&& X!="").
			collect(Collectors.groupingBy(a-> a,LinkedHashMap::new,Collectors.counting()));
	
	System.out.println("wordCount-->  "+wordcount);
	
	//char count
	Map<Object, Long>charcount=Arrays.stream(s.split("")).filter(X->X!=" "&& X!="").
			collect(Collectors.groupingBy(a-> a,LinkedHashMap::new,Collectors.counting()));
	
	System.out.println("CharCount-->  "+charcount);
	
	}
	

	

}

