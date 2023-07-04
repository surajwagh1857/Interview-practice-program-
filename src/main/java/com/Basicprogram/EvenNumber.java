package com.Basicprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(10,11,12,13,15,16,17,18,19);
		List list1=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list1);
		
		
		
	}

}
