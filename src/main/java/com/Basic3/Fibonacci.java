package com.Basic3;

public class Fibonacci {
public static void main(String[] args) {
	System.out.println("here we are printing fibonacci no...");
	int n1=0,n2=1,n3,count=10;
	for(int i=0;i<count;i++) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(" "+n3);
	}
}
}
