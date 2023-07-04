package com.CompanyInterviewPrograms;

public class RevreseString {

	public static void main(String[] args) {
		String str="Suraj";
		String reverse="";
		char[] charArray=str.toCharArray();
		System.out.println(charArray);
		for(int i=charArray.length-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
			
		}
		
		System.out.println(reverse);
	}

}
