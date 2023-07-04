package com.BasicProgram2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDupicateNumber {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(10,11,11,12,13,12,13,15,16,17,17,18);
HashSet<Integer>hs=new HashSet<Integer>();
	Set<Integer> set=list.stream().filter(a->!hs.add(a)).collect(Collectors.toSet());
	System.out.println("By normal way....!!");
	System.out.println(set);
	System.out.println("");
	
	System.out.println("By java util collection frequency method");
	
	Set set1=list.stream().filter(a->Collections.frequency(list,a)>1).collect(Collectors.toSet());
    System.out.println(set1);
} 

}
