package com.Basicprogram;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateChar {
public static void main(String[] args) {
	
	String str="aabbccdefgh";
	int count=0;
	char[]inp=str.toCharArray();
	for(int i=0;i<inp.length;i++) {
		for(int j=i+1;j<inp.length;j++) {
			if (inp[i]==inp[j]) {
				System.out.println(inp[j]);
				count++;
			}
		}
	}
	System.out.println("Count of dupicate chars-->"+count);
Map<Object, Long> characount=Arrays.stream(str.split("")).filter(x->x!=""&&x!=" ").
collect(Collectors.groupingBy(a->a,LinkedHashMap::new,Collectors.counting()));
	
	System.out.println("Duplicate count by java8-->"+characount);
}
}
/** System.out.println("using java8....!!");
	
	Map<Object, Long>charCount=Arrays.stream(s.split("")).filter(X->X!=" "&& X!="").
			collect(Collectors.groupingBy(a-> a,LinkedHashMap::new,Collectors.counting()));
	
	System.out.println("CharCount-->  "+charcount);**/