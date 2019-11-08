package com.TestFramework;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class UnitTests {

	@Test
	public void testHomePage() {
		Pages.homePage().goTo();
		assertTrue(Pages.homePage().isAt());
	}

}
