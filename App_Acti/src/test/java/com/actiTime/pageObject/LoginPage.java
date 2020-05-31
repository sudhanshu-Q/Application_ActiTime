package com.actiTime.pageObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actTime.utiities.ReadDataConfiguration;

public class LoginPage
{
	ReadDataConfiguration read=new ReadDataConfiguration();
	public WebDriver ldDriver;
	public LoginPage(WebDriver rdriver)
	{
		ldDriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="username")
	@CacheLookup
	WebElement tbUsername;
	
	@FindBy(name="pwd")
	@CacheLookup
	WebElement tbpassword;
	
	@FindBy(id="loginButton")
	@CacheLookup
	WebElement BtnSignIn;
	
	
	@FindBy(id="blank-install")
	@CacheLookup
	WebElement LaunchActiTime;
	
	@FindBy(xpath="//button[@class='startButton']")
	@CacheLookup
	WebElement startUsingBTN;
	
	public void setUserName()
	{
		tbUsername.sendKeys(read.getUsername());
	}
	public void setPassword()
	{
		tbpassword.sendKeys(read.getPassword());
	}
	public void clickSignInBTN()
	{
		BtnSignIn.click();
	}
	public void clickLaunchActitime()
	{
		LaunchActiTime.click();
	}
	public void clickOnStartActiTime()
	{
		startUsingBTN.click();
	}

}
