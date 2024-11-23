package com.pages;

import org.openqa.selenium.By;
import org.testing.BaseClassTest;

public class LoginPage extends BaseClassTest{
	
	//by Locators
	
	By uname = By.id("email");
	By pwd = By.id("pass");
	By login = By.name("login");
	By forgot_pwd = By.linkText("Forgotten password?");
	
	//Actions and methods
	
	public boolean checkLink()
	{
		boolean status = driver.findElement(forgot_pwd).isDisplayed();
		return status;
	}
	
public void do_login()
{
	driver.findElement(uname).sendKeys("Oranium@gmail.com");
	driver.findElement(pwd).sendKeys("Tech");
	driver.findElement(login).click();
}
}
