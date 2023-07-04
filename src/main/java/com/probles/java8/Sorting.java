package com.probles.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {
public static void main(String[] args) {
	
	List<Integer> list=Arrays.asList(11,17,19,12,13,14,15,18);
	Object list1=list.stream().sorted().collect(Collectors.toList());
	System.out.println("Natural sorting order---->"+list1);
	
	
	List list2=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println("sorting order by comparator---->"+list2);
}
}
