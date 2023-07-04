package com.BasicProgram2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

public class DupicateWordCount {
public static void main(String[] args) {
	String str="this is suraj suraj is qa";
	
	HashMap<String, Integer>hm=new HashMap<String, Integer>();
	
	for(String word:str.split(" ")) {
		hm.put(word,hm.containsKey(word)?hm.get(word)+1:1);
	}
	hm.forEach((k,v)->{if(k!=" ") {
		System.out.println(k+"    "+v);
	}});
	
	//By using java8
	Map<Object, Long>map=Arrays.stream(str.split(" ")).filter(a->a!=" "&&a!="").collect(Collectors.groupingBy(a->a,HashMap::new,Collectors.counting()));
	System.out.println(map);
}
}
