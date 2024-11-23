package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDriven {
	
	WebDriver driver;
	
	@Parameters({"URL"})
		
	@Test(priority=0)
	
	public void fburl(String url)
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
				
	}
	@Parameters({"username","password"})
	@Test(priority=1)
	public void fbLogin(String uname, String password)
	{
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}

}
