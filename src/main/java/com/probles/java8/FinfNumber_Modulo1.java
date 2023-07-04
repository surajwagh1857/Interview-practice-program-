package com.probles.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FinfNumber_Modulo1 {
public static void main(String[] args) {
	
	List<Integer>list=Arrays.asList(15,26,11,84,16,41,31,19,89);
	
	List<Integer>mod_1=list.stream().filter(a-> a/10==1).collect(Collectors.toList());
	
	System.out.println(mod_1);
}
}
//List l = list.stream().filter(a -> a/10==1).collect(Collectors.toList());