package org.testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Attributes {
	@Test(priority=-2, description ="Test case for login function")
	public void login()
	{
		System.out.println("Login functionality check");
		Assert.assertTrue(false);     //hard assert
	}   
	
	@Test(priority=-1, dependsOnMethods="login", alwaysRun=true)
	public void homePage()
	{
		System.out.println("HomePage functionality check");
	}
    @Test(priority=0, enabled = true, timeOut=2000)
	public void productPage() throws InterruptedException
	{
     Thread.sleep(2100);
     System.out.println("ProductPage functionality check");
	
	}
	
    
    @Test(priority=1, invocationCount=3, invocationTimeOut=2000)
	public void addToCart()
	{
		System.out.println("Addtocart functionality check");
	}
    
    @Test(priority=2, expectedExceptions = Exception.class)
    public void orderPage()
    {
    	int x = 100;
    	System.out.println(x/0);
    	
    	System.out.println("Order page functionality check");
    }
}
