package com.Basic3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNumber {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 11, 13, 14, 16);
		
		HashSet<Integer>hs=new HashSet<Integer>();
		Set set1=list.stream().filter(a->!hs.add(a)).collect(Collectors.toSet());
		System.out.println("Normal way---->");
		System.out.println(set1);
		
		Set set2=list.stream().filter(a->Collections.frequency(list, a)>1).collect(Collectors.toSet());
		System.out.println("By using Frequency method---->"); 
		System.out.println(set2);
	}
}
