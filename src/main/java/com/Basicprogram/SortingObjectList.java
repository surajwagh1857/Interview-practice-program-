package com.Basicprogram;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.java8.Person;

public class SortingObjectList {
public static void main(String[] args) {
	Person p1 = new Person(10,"Ram","Pune");
	Person p3 = new Person(30,"Vishal","Satar");
	Person p4 = new Person(40,"Hari","Kolhapur");
	Person p5 = new Person(50,"Nilesh","Sangli");
	Person p2 = new Person(20,"Sham","Mumbai");
	
	List<Person>list=new ArrayList<Person>();
	list.add(p1);
	list.add(p2);
	list.add(p3);
	list.add(p4);
	list.add(p5);
	System.out.println("Sorting by Id....!!!");
	List<Person>list1=list.stream().sorted(Comparator.comparingInt(Person::getId)).collect(Collectors.toList());
	list1.stream().forEach(System.out::println);
	System.out.println("Sorting by Name....!!!");
	List list2=list.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());
	list2.stream().forEach(System.out::println);
	
//	System.out.println("Sorting by Reverse Order....!!!");
//	list.stream().sorted(Comparator.reverseOrder());
//	
}
}
