package com.BasicProgram2;

public class DuplicateWord {
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
	}

}
