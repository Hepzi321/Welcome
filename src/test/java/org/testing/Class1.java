package org.testing;

import org.testng.annotations.Test;

public class Class1 {
	
	@Test(groups = "Regression")
	public void m1()
	{	
		System.out.println("Method 1");	
	}
	
	@Test(groups = {"Smoke", "Sanity"})
	public void m2()
	{
		
		System.out.println("Method 2");
		
	}

}
