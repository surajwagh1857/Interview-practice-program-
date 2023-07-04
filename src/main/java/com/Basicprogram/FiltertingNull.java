package com.Basicprogram;

import java.util.ArrayList;

public class FiltertingNull {
public static void main(String[] args) {
	
	ArrayList<String>al=new ArrayList<String>();
	al.add("suraj");
	al.add("komal");
	al.add("nisha");
	al.add(null);
	al.add("devraj");
	System.out.println("By the Normal way we filter the not null values...!!!");
	for(String a1:al) {
		if(a1!=null)
		System.out.println(a1);
	}
	System.out.println("By using Java8 ...!!!");
	
	al.stream().filter(k->k!=null).forEach(k->System.out.println(k));
	
	
	
}
}
