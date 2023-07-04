package com.Basic3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.probles.java8.Person;

public class AvgAndGrpBySalary {
public static void main(String[] args) {
	
	Person e1=new Person(10, "Suraj", 9000);
	Person e2=new Person(30, "Komal", 7000);
	Person e3=new Person(50, "Rutuja", 9000);
	Person e4=new Person(20, "Prasad", 7000);	
	Person e5=new Person(40, "sanjeevani", 7200);
	
	List<Person> list=Arrays.asList(e1,e2,e3,e4,e5);
   Double avg_salary= list.stream().collect(Collectors.averagingInt(Person::getSalary));
	System.out.println("avg salary-->"+avg_salary);
	
	Map<Object,Long>group_bySalary=list.stream().collect(Collectors.groupingBy(a->a.getSalary(),Collectors.counting()));
	System.out.println("group by salary--->"+group_bySalary);
	
	
}

}
