package com.probles.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxNum {
public static void main(String[] args) {
	
	List<Integer> list=Arrays.asList(10,14,16,17,11,12,13,18,19,15);
	//Using java 8
	System.out.println("Using java 8....");
	Integer maxNum=list.stream().max(Comparator.naturalOrder()).get();
	Integer minNum=list.stream().min(Comparator.naturalOrder()).get();
	
	System.out.println(maxNum+"  "+minNum);
	
	
	//By integer method....
	System.out.println("By integer method....");
	Integer maxNum1=list.stream().max(Integer::compare).get();
	Integer minNum1=list.stream().min(Integer::compare).get();
	System.out.println(maxNum1+"   "+minNum1);
	
	//By using value of method....
	System.out.println("By Integer ValueOf method....");
	Integer maxNum2=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
	Integer minNum2=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
	
	System.out.println(maxNum2+"  "+minNum2);
}
}
