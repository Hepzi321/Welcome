package org.testing;

import org.testng.annotations.Test;

public class Class3 {
	@Test(groups = "Sanity")
	public void m5()
	{
		System.out.println(System.currentTimeMillis());
		System.out.println("Method 5");
			
	}
	
	@Test(groups = {"Regression","Sanity"})
	public void m6()
	{
		System.out.println(System.currentTimeMillis());
		System.out.println("Method 6");
		
	}
	
	@Test(groups = "Smoke")
	public void m7()
	{
		System.out.println(System.currentTimeMillis());
	
		System.out.println("Method 7");
		
	}
}
