package com.java8;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class SortingCovertingCollectingList {
public static void main(String[] args) {
	

	Person p1 = new Person(10, "Ram", "Pune");
	Person p2 = new Person(20, "Sham", "Mumbai");
	Person p3 = new Person(30, "Vishal", "Satar");
	Person p4 = new Person(40, "Hari", "Kolhapur");
	Person p5 = new Person(50, "Nilesh", "Sangli");

	List<Person> list = new ArrayList<>();
	list.add(p1);
	list.add(p4);
	list.add(p2);
	list.add(p5);
	list.add(p3);
	System.out.println(list);
	//implement comparable in person and then use following ....
	//List l=list.stream().sorted().collect(Collectors.toList());
	//System.out.println(l);
	Map<Integer,String>map=list.stream().collect(Collectors.toMap(Person::getId,Person::getName,(oldvalue,newvalue)->newvalue,LinkedHashMap::new ));
	System.out.println(map);
}
}
