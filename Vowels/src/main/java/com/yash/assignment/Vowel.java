package com.yash.assignment;

import java.util.function.IntPredicate;

public class Vowel {

	public int countVowelsOfAString(String input) {
		IntPredicate vowel = new IntPredicate() {

			public boolean test(int value) {
				return value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u' || value == 'A'
						|| value == 'E' || value == 'I' || value == 'O' || value == 'U';
			}

		};
		
		return (int) input.chars().filter(vowel).count();

	}

	public static void main(String[] args) {
		Vowel vowel=new Vowel();
		System.out.println(vowel.countVowelsOfAString("includehelp"));
	}
}
