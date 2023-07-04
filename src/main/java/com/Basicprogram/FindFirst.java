package com.Basicprogram;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
public static void main(String[] args) {
	
	List<Integer> list=Arrays.asList(10,11,12,13,14,15,16,17,18);
	Integer i1=list.stream().findFirst().get();
	System.out.println(i1);
	
}
}
