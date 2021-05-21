package com.automationpractice.utils;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

import com.automationpractice.base.TestBase;

public class CustomListener extends TestBase implements ITestListener {
@Override
public void onTestStart(ITestResult result) {
	logger.info("Test started: "+result.getMethod().getMethodName());
	}
@Override
public void onTestSuccess(ITestResult result) {
	logger.info("Test passed: "+result.getMethod().getMethodName());
}
@Override
public void onTestFailure(ITestResult result) {
	logger.info("Test Failed: "+result.getMethod().getMethodName());
}
@Override
public void onTestSkipped(ITestResult result) {
	logger.info("Test Skipped: "+result.getMethod().getMethodName());
	}
@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}
@Override
public void onStart(ITestContext context) {
	
	}
@Override
public void onFinish(ITestContext context) {
	
	}


	
}
