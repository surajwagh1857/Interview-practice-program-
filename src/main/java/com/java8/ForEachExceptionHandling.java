package com.java8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachExceptionHandling {
	public static void main(String[] args) {
		 ArrayList<String>al=new ArrayList<String>();
		 al.add("Suraj");
		 al.add("Komal");
		 al.add("10");
		 al.add("Mahesh");
		 al.add("Janhavi");
			
		 Consumer<String>c=k->{try {
			 Integer i=Integer.parseInt(k);
			System.out.println("Integer value-->"+i);
		} catch (Exception e) {
			System.out.println("I got exception.....");
		}};
		 
		 
		 al.stream().forEach(c);
		 
		 
		 
	}
}
