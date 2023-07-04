package com.BasicProgram2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.probles.java8.Person;

public class AvgBySalary {
public static void main(String[] args) {
	Person e1=new Person(10, "Suraj", 9000);
	Person e2=new Person(30, "Komal", 7000);
	Person e3=new Person(50, "Rutuja", 9000);
	Person e4=new Person(20, "Prasad", 7000);	
	Person e5=new Person(40, "sanjeevani", 7200);
	
	List<Person> list=Arrays.asList(e1,e2,e3,e4,e5);
	Map<Object, Long> group_bysalary=list.stream().collect(Collectors.groupingBy(a->a.getSalary(),Collectors.counting()));
	System.out.println(group_bysalary);
}
}
