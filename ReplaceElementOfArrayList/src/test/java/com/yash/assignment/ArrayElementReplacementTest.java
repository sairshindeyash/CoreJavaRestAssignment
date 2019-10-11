package com.yash.assignment;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.yash.exception.NoSuchElementFoundException;

public class ArrayElementReplacementTest {

	ArrayElementReplacement arrayElementReplacement=new ArrayElementReplacement();
	@Test
	public void shouldReturnModifiedArrayListAfterReplacingElement() {
		List<Integer> list=Arrays.asList(55,6,368);
		assertEquals(list, arrayElementReplacement.replaceElement(25,6,Arrays.asList(55,25,368)));
		
	}
	
	@Test(expected = NoSuchElementFoundException.class)
	public void shouldThrowNoElementFOundExceptionIfPassedElementIsnotPresentInTheArraylist() {
		arrayElementReplacement.replaceElement(21, 6, Arrays.asList(55,25,368));
	}
}
