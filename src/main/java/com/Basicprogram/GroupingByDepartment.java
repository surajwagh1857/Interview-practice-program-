package com.Basicprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.probles.java8.Student;

public class GroupingByDepartment {
public static void main(String[] args) {
	Student s1 = new Student(10,"Ram","IT");
	Student s2 = new Student(20,"Sham","Mech");
	Student s3 = new Student(50,"Hari","Auto");
	Student s4 = new Student(40,"Umesh","IT");
	Student s5 = new Student(30,"Nilesh","Mech");
	
	List<Student> list=Arrays.asList(s1,s2,s3,s4,s5);
	Map<Object, Long>countbydept=list.stream().collect(Collectors.groupingBy(a->a.getDepartment(),Collectors.counting()));

    System.out.println(countbydept);
}
}
