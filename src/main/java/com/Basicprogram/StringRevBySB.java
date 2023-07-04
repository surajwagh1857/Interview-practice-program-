package com.Basicprogram;

public class StringRevBySB {
public static void main(String[] args) {
	
	String str="Suraj";
	StringBuffer sb=new StringBuffer(str);
	String rev_Str=sb.reverse().toString();
	System.out.println(rev_Str);
}
}
