package com.yash.assignment;

public class Capitalize {

	public String changeCaseOfLetter(String original) {
		String modifiedString = "";
		
			
			String[] words = original.split(" ");
			for (String word : words) {
				System.out.println("word==" + word);
				char[] letters = word.toCharArray();

				for (int i = 0; i < letters.length; i++) {
					if (i == 0 || i == letters.length - 1) {
						// String r=Character.toString(letters[i]);
						System.out.println("let===" + letters[i]);
						modifiedString = modifiedString + Character.toString(letters[i]).toUpperCase();
					} else {
						modifiedString = modifiedString + Character.toString(letters[i]);
					}
				}
				modifiedString = modifiedString + " ";
			}
		
		
		return modifiedString.substring(0, modifiedString.length() - 1);

	}

	public static void main(String[] args) {
		Capitalize capitalize = new Capitalize();
		System.out.println(capitalize.changeCaseOfLetter("yash pune office"));
	}
}
