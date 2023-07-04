package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListOperations {
public static void main(String[] args) {
	List<String>list=new ArrayList<String>();
	list.add("A");
	list.add("D");
	list.add("B");
	list.add("C");
	list.add("E");
	System.out.println(list);
	List <String>list1=Collections.unmodifiableList(list);
	//list1.add("F");
	//System.out.println(list1);
	

	System.out.println("Iterating list by normal way");
	for (String string : list) {
	System.out.println(string);
	}
	System.out.println("************************");
	
	System.out.println("iterating by java8 foreach with lambda expression...");
	list.stream().forEach(k->System.out.println(k));
	
	System.out.println("iterating by java8 foreach  with method reference....");
	list.stream().forEach(System.out::println);
	
	List sortedlist1=list.stream().sorted().collect(Collectors.toList());
	List sortedlist2=list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	List sortedlist3=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

System.out.println("Sort by Default "+sortedlist1);
System.out.println("Sort by natural order "+sortedlist2);
System.out.println("Sort by Reverse Order "+sortedlist3);

}
}
