package com.etb;

import static org.junit.Assert.*;

import org.junit.Test;

public class InitialTests {

	@Test
	
	public void test() {
		Pages.homePage().goTo();
		assertTrue(Pages.homePage().isAt());
	}
}
