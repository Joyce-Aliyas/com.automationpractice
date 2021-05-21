package com.automationpractice.utils;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.automationpractice.base.TestBase;

public class RetryFailedTest extends TestBase implements IRetryAnalyzer {
	
	int counter;
	int maxCounter=1;
	
	@Override
	public boolean retry(ITestResult result) {
		if (counter<maxCounter) {
			counter++;
			return true;
		}
		return false;
	}

}
