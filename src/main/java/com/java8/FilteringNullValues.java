package com.java8;

import java.util.ArrayList;

public class FilteringNullValues {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList();
		al.add("A");
		al.add("B");
		al.add(null);
		al.add("C");
		al.add("D");
		
		System.out.println(al);
		System.out.println("By normal way....!!!");
		for (String s1 : al) {
			if (s1 !=null) {
				System.out.println(s1);
			}
		}
		System.out.println("By Java8 way....!!!");
		al.stream().filter(k->k!=null).forEach(System.out::println);
		
	}

}
