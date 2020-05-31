package com.actiTime.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.actiTime.Test.Baseclass;

public class TC_001_LoginTest extends Baseclass
{
	com.actTime.utiities.ReadDataConfiguration readLogin=new com.actTime.utiities.ReadDataConfiguration();
	public WebDriver driver;
	
@Test
public void loginTest()
{
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(readLogin.getUrl());
	com.actiTime.pageObject.LoginPage initLogin=new com.actiTime.pageObject.LoginPage(driver);
	initLogin.setUserName();
	initLogin.setPassword();
	initLogin.clickSignInBTN();
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
}
}
