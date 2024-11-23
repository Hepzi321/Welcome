package org.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FbCheck extends BaseClassTest{
	@Test
	public void fbTitle()
	{
		String actualtitle = driver.getTitle();
		String expectedtitle = "Facebook – log in or sign up";
	    Assert.assertEquals(actualtitle, expectedtitle);
		
	}
	@Test
	public void fburl()
	{
		String actualurl = driver.getCurrentUrl();
		String expectedurl = "https://www.facebook.com/";
		Assert.assertEquals(actualurl, expectedurl);
		
	}
	
	

}
