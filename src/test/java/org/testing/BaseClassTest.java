package org.testing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pages.LoginPage;

public class BaseClassTest {
	
	Properties prop;
	public static WebDriver driver;
	
	public static LoginPage fblogin = new LoginPage();
	
	@BeforeMethod
	public void setup() throws IOException
	{
		File f = new File(System.getProperty("user.dir")+ "\\src\\test\\resources\\ConfigFile\\config.properties");
	FileReader fr = new FileReader(f);
		prop = new Properties();
		
		prop.load(fr);
		
		if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			driver.get(prop.getProperty("testUrl"));
			driver.manage().window().maximize();
		}
		
		else if (prop.getProperty("browser").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			driver.get(prop.getProperty("testUrl"));
			driver.manage().window().maximize();
		}
		
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("testUrl"));
			driver.manage().window().maximize();
		}
		
		else
		{
			System.out.println("Pass the valid browser");
		}
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
