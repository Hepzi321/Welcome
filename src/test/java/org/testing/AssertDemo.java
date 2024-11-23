package org.testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	
	@Test
	public void login()
	{
		
		Assert.assertEquals(10, 11);
		System.out.println("After Assert...");
		
	}
	
	@Test
	public void homepage()
	{
		SoftAssert s = new SoftAssert();
		s.assertTrue(false);
		
		System.out.println("Print Soft Assert...");
		s.assertAll();
	}

}
