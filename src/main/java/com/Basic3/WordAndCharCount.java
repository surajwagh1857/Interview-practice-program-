package com.Basic3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordAndCharCount {
	public static void main(String[] args) {

		String str = "This is suraj suraj is devloper";
		String[] arr = str.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String word : arr) {
			hm.put(word, hm.containsKey(word) ? hm.get(word) + 1 : 1);
		}
		hm.forEach((k, v) -> {
			if (k != " ") {
				System.out.println(k + "     " + v);
			}
		});
		//find word count by using java 8
		Map<Object, Long>word_count=Arrays.stream(str.split(" ")).filter(a->a!=""&&a!=" ")
				.collect(Collectors.groupingBy(a->a,HashMap::new,Collectors.counting()));
	
	System.out.println(word_count);
	
	}
}
