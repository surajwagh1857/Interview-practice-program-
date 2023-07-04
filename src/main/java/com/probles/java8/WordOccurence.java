package com.probles.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class WordOccurence {
public static void main(String[] args) {
	
	String str="Hello world";
	
Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(a->a,LinkedHashMap::new,Collectors.counting())).
	forEach((k,v)->System.out.println(k+"  "+v));
	
}
}
/*
 * Arrays.stream(s.split(" "))
 * .collect(Collectors.groupingBy(a->a,LinkedHashMap::new,Collectors.counting())
 * ) .forEach((k,v) -> System.out.println(k+" "+v));
 */