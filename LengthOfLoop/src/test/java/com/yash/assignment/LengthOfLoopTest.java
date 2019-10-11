package com.yash.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LengthOfLoopTest {

	LengthOfLoop length=new LengthOfLoop();
	@Test
	public void shouldReturn3AsLengthOfLoopIs3() {
		assertEquals(3, length.countNodesinLoop(list));
	}
}
