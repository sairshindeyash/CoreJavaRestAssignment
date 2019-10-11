package com.yash.assignment;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SublistTest {
	SubList subList=new SubList();
	
	@Test
	public void shouldReturnSubListFromArrayList() {
		assertEquals(Arrays.asList(10, 5, 20, 30, 22), subList.sublist( 5, 10, Arrays.asList(1,2,3,4,5,10,5,20,30,22,66)));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void shouldThrowExceptionWhenStartIndexIsGreaterThanEndIndex() {
		 subList.sublist( 10, 5, Arrays.asList(1,2,3,4,5,10,5,20,30,22,66));
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void shouldThrowExceptionWhenEndIndexIsOutofRange() {
		 subList.sublist( 10, Arrays.asList(1,2,3,4,5,10,5,20,30,22,66).size()+1, Arrays.asList(1,2,3,4,5,10,5,20,30,22,66));
	}
}
