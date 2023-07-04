package com.probles.java8;

public class Employee {
String name;
String department;
Integer salary;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public Integer getSalary() {
	return salary;
}
public void setSalary(Integer salary) {
	this.salary = salary;
}
public Employee(String name, String department, Integer salary) {
	super();
	this.name = name;
	this.department = department;
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
}








}
