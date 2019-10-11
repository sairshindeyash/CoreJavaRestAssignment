package com.yash.assignment;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class GuessNextTest {
	GuessNext guessNext=new GuessNext();
	
	
	@Test
	public void shouldReturn10AsaNextNumberInASeries() {
		int expected=10;
		assertEquals(expected, guessNext.nextNumber(Arrays.asList(7,10,8,11,9,12)));
	}
}
