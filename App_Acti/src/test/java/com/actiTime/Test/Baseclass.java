package com.actiTime.Test;



import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		driver.get(readconfig.getUrl());

	}
	@AfterClass
	public void shutDown()
	{
		// driver.quit();
	}
	public void takeScreenshot(String testMethodName)
	{
		TakesScreenshot screeenshot=(TakesScreenshot) driver;
		File source=screeenshot.getScreenshotAs(OutputType.FILE);
		try 
		{
			System.out.println("Screenshot taken");	
			String Filepath="./App_Acti\\Screenshots";
			new File(Filepath);
			FileUtils.copyFile(source, new File("./App_Acti\\Screenshots"+ "Screenshots" +testMethodName + "sc_jpg"));
			System.out.println("placed screen shot in" +source);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("exception while taking screenshot"+ e.getMessage());
		}

	}

}

