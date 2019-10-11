package com.yash.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VowelTest {
 Vowel vowel=new Vowel();
 
 @Test
 public void shouldReturn4WhenInputIsIncludeHelp() {
	 int expected=4;
	 String input="includehelp";
	 assertEquals(expected, vowel.countVowelsOfAString(input));
 }
}
