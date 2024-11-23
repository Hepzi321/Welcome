package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.LoginPage;
@Test
public class LoginTest extends LoginPage{
	
	public void checkForgotPwd_Exist()
	{
		boolean status = fblogin.checkLink();
		Assert.assertTrue(status);
	}

}
