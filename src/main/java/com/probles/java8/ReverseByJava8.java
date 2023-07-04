package com.probles.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseByJava8 {
public static void main(String[] args) {
	
	
	List<Integer>list=Arrays.asList(10,12,11,13,14,15,16,17,18);
	
	LinkedList<Integer>Link_list=new LinkedList<Integer>();
	
	list.stream().forEach(a->Link_list.addFirst(a));
	System.out.println("Reversing list by normal way-->"+Link_list);
	
	
	//way2
	List rev_list=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println("Reversing list by using sort comparator -->"+rev_list);
}
}
