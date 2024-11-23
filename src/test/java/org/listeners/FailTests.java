package org.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailTests {
	
	@Test(retryAnalyzer = MyListener2.class)
	public void tc1()
	{
		Assert.assertTrue(false);
	}
    @Test(retryAnalyzer = MyListener2.class)
	public void tc2()
	{
		Assert.assertTrue(true);
	}
	@Test(retryAnalyzer = MyListener2.class)
	public void tc3()
	{
		Assert.assertFalse(true);
	}
}
