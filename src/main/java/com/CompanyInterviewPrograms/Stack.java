package com.CompanyInterviewPrograms;

import java.util.Arrays;
//Phicommerce company yeravada
// Create custom stack i.e is write the push method implementation
public class Stack {

	private int top;
	private int maxsize;
	private int []stackArray;
	public Stack( int maxsize) {
		super();
		this.top = -1;
		this.maxsize = maxsize;
		this.stackArray = new int [maxsize];
	}
	public void push(int element) {
		if(top==maxsize-1) {
			System.out.println("stack is full you can not push the "+element);
		}
		else {
			stackArray[++top]=element;
			System.out.println("pushed element is "+element);
		}
	}
	@Override
	public String toString() {
		return "Stack [top=" + top + ", maxsize=" + maxsize + ", stackArray=" + Arrays.toString(stackArray) + "]";
	}
	public static void main(String[] args) {
		Stack s1=new Stack(5);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);
		
		System.out.println("stack--->"+s1);
	}
	
	
	
}
