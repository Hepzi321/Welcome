package org.testing;

import org.testng.annotations.Test;

public class Class2 {
	@Test(groups = "Smoke")
	public void m3()
	{
		System.out.println(System.currentTimeMillis());
		System.out.println("Method 3");
		
	}
	
	@Test(groups = {"Regression", "Sanity"})
	public void m4()
	{
		System.out.println(System.currentTimeMillis());
		System.out.println("Method 4");
	
	}

}
