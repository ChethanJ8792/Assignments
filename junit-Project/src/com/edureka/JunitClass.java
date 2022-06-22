package com.edureka;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JunitClass {
	@Test
	public void setUp()
	{
		String obj1="Junit";
		String obj2="Junit";
		assertEquals(obj1,obj2);
	}

}
