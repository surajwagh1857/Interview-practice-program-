package com.probles.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AvgByDepartment {
public static void main(String[] args) {
	
	Employee e1=new Employee("suraj", "IT", 70000);
	Employee e2=new Employee("Komal", "QA", 40000);
	Employee e3=new Employee("Sayali", "Production", 60000);
	Employee e4=new Employee("Madhura", "Support", 40000);
	Employee e5=new Employee("Rutuja", "Hr", 41000);
	
	List<Employee> list=Arrays.asList(e1,e2,e3,e4,e5);
	Map<Object, Double>map=list.stream().collect(Collectors.groupingBy(a->a.getDepartment(),Collectors.averagingInt(Employee::getSalary)));
System.out.println(map);



}
}
