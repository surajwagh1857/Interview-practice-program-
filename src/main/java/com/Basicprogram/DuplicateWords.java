package com.Basicprogram;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateWords {
	public static void main(String[] args) {

		String str = "Big black bug bit a big black dog on his big black nose";
		int count = 0;
		String[] word = str.split(" ");
		for (int i = 0; i < word.length; i++) {
			for (int j = i + 1; j < word.length; j++) {
				if (word[i].equals(word[j])) {
					System.out.println(word[j]);
					count++;
				}
			}
		}
		System.out.println(count);
		
		
Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(a->a,LinkedHashMap::new,Collectors.counting()))
.forEach((k,v)->System.out.println(k+"-->"+v));
	}
}
/*
 * Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(a->a,
 * LinkedHashMap::new,Collectors.counting())).
 * forEach((k,v)->System.out.println(k+"  "+v));
 */
