package com.actitime.test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class ListenerImplementation extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("Failed TC"+result.getName());
        //String TCName=result.getMethod().getMethodName();
        // String TCName=result.getName();
	}
	@Override
	public void onTestSuccess(ITestResult result) {
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestStart(ITestResult result) {
	}
	@Override
	public void onFinish(ITestContext context) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

}
