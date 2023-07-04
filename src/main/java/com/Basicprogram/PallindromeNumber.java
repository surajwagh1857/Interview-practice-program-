package com.Basicprogram;

public class PallindromeNumber {
public static void main(String[] args) {
	int temp,sum=0;
	int num=141;
	temp=num;
	while(num!=0) {
		int remainder=num%10;
		sum=(sum*10)+remainder;
		num=num/10;
		
	}
	
	if (sum==temp) {
		System.out.println("Number is pallindrome...!!!");
	} else {
		System.out.println("Number is not pallindrome...!!!");
	}
}
}
