package com.actTime.utiities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.actiTime.Test.Baseclass;

public class ListenerTest extends Baseclass implements ITestListener 

{

	public void onTestStart(ITestResult Result)
	{
		System.out.println("Executing test cases started");
		System.out.println("Started"+Result.getName());

	}

	public void onTestSuccess(ITestResult Result) 
	{
		System.out.println("Test succeeded");
		System.out.println("Test succeeded"+Result.getName());

	}

	public void onTestFailure(ITestResult Result) 
	{
		System.out.println("Test Failed");
		System.out.println(Result.getName());
		System.out.println("Test failed with screenshot captured");
		System.out.println("The name of the test case failed "+Result.getName());
		takeScreenshot(Result.getMethod().getMethodName());

	}

	public void onTestSkipped(ITestResult Result) 
	{
		System.out.println("Test case skipped");
		System.out.println("Skipped Test case"+Result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result)
	{
		System.out.println("Test case failure with success percntage");

	}

	public void onStart(ITestContext Result)
	{
		System.out.println("Test started");
		System.out.println("Test case started "+Result.getName());

	}

	public void onFinish(ITestContext context) 
	{
		System.out.println("Finally Test case finish "+context.getName());
		
	}

}
