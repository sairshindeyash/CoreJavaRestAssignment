package com.yash.assignment;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SeriesTest {
	
	Series series=new Series();
	
	@Test
	public void shouldReturn19AsOddNumberfromTheSeries() {
		Integer[] num=new Integer[] {3,12,8,19,13,32,18,42,23,52};
		int expected=19;
		assertEquals(expected, series.oddNumberFromSeries(num));
	}
}
