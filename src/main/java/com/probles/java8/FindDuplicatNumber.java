package com.probles.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatNumber {
public static void main(String[] args) {
	List<Integer>list=Arrays.asList(10,11,12,13,11,14,10,12,15,16);
	Set<Integer>item=new HashSet();
	Set s1=list.stream().filter(n -> !item.add(n)).collect(Collectors.toSet());
	
	System.out.println(s1);
	
	System.out.println("Find duplicate by java8....!!!");
	
	Set<Integer>set1=list.stream().filter(a->Collections.frequency(list,a )>1).collect(Collectors.toSet());
	
	System.out.println(set1);
	
}
}
