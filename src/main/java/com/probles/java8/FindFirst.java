package com.probles.java8;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
public static void main(String[] args) {
	
	List<Integer>list=Arrays.asList(10,15,12,13,14,17,16,11);
	Integer i=list.stream().findFirst().get();
	
	System.out.println(i);
	
	System.out.println("Find count....!!!");
	
	long count=list.stream().count();
	
	System.out.println("Count of list element..."+count);
	
}

}
