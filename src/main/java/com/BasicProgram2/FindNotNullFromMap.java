package com.BasicProgram2;

import java.util.HashMap;

public class FindNotNullFromMap {
public static void main(String[] args) {
	HashMap<Integer, String> hm=new HashMap<Integer, String>();
	 hm.put(10,"suraj");
	 hm.put(20,"komal");
	 hm.put(30,"sanjivanee");
	 hm.put(null,"akshay");
	 hm.put(40,null);
	 
	 System.out.println(hm);
	
	if(hm!=null) {
		System.out.println(hm);
	}
hm.forEach((k,v)->{
	if(k!=null&&v!=null) {
		System.out.println(k+"    "+v);
	}
});
	
	
}
}
