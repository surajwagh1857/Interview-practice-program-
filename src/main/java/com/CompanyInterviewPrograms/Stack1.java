package com.CompanyInterviewPrograms;

import java.util.Arrays;

public class Stack1 {
	private int maxSize;
	private int top;
	private int[] stackArray;

	public Stack1(int maxSize) {
		this.top = -1;
		this.maxSize = maxSize;
		this.stackArray = new int[maxSize];
	}

	public void push(int element) {
		if (top == maxSize - 1) {
			System.out.println("stack is all ready full we can not push element " + element);
		} else {
			stackArray[++top] = element;
			System.out.println("pushed element " + element);
		}
	}
	
	public static void main(String[] args) {
		Stack1 s1=new Stack1(5);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);
		
		System.out.println("stack is ---> "+s1);
	}

	@Override
	public String toString() {
		return "Stack1 [maxSize=" + maxSize + ", top=" + top + ", stackArray=" + Arrays.toString(stackArray) + "]";
	}
}
