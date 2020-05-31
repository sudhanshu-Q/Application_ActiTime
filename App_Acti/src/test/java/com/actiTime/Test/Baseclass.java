package com.actiTime.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.actTime.utiities.ReadDataConfiguration;

public class Baseclass 
{
	public static WebDriver driver;
	ReadDataConfiguration readconfig=new ReadDataConfiguration();

	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		driver=new ChromeDriver();
		
	}
	@AfterClass
	public void shutDown()
	{
		// driver.quit();
	}

}
