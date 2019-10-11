package com.yash.assignment;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MinMaxArrayTest {
	MinMaxArray minMaxArray=new MinMaxArray();
	
	@Test
	public void shouldReturnListContainingMinMaxElementsOfArray() {
		List<Integer> minMax=Arrays.asList(1,10);
		Integer[] numbers=new Integer[] {1,5,7,9,10};
		assertEquals(minMax, minMaxArray.minMaxFromArray(numbers));
	}
}
