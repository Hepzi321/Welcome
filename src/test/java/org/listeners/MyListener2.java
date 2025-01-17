package org.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyListener2 implements IRetryAnalyzer{

	int mincount = 0;
	int maxcount = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		while (mincount<maxcount)
		{
			mincount++;
			return true;
		}
		
		return false;
	}

}
