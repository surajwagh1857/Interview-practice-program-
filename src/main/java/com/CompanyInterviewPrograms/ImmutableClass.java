package com.CompanyInterviewPrograms;

final class  Employee{
	final private String pancardNumber;
	 public Employee(String pancardNumber){
		this.pancardNumber=pancardNumber;
	}
	public String getPancardNumber(){
		return pancardNumber;
	}
	
	
}

public class ImmutableClass {
public static void main(String[] args) {
	Employee e1=new Employee("Suraj@123");
	String s1=e1.getPancardNumber();
	System.out.println(s1);
}
}
