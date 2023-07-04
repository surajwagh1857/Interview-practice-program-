package com.Basic3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(10,11,12,13,14,15,16,17,18,19);
List<Integer>even_number=	list.stream().filter(i->i%2==0).collect(Collectors.toList());
	
	System.out.println("Even numbers are--->"+even_number);
	
}
}
