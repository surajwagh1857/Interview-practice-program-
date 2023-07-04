package com.Basic3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateWordCount {
	public static void main(String[] args) {

		String str = "this is suraj suraj is qa";
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (String word : str.split(" ")) {
			map.put(word, map.containsKey(word) ? map.get(word) + 1 : 1);
		}
		map.forEach((k, v) -> {
			if (k != " ") {

				System.out.println(k + "    " + v);
			}
		});
		// By java 8
		Map<Object, Long> duplicateword = Arrays.stream(str.split(" ")).filter(k -> k != " " && k != "")
				.collect(Collectors.groupingBy(a -> a, LinkedHashMap::new, Collectors.counting()));
		System.out.println(duplicateword);

	}
}
