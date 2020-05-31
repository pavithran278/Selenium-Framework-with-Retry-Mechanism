package common;

import org.testng.ITestResult;

public class RetryAnalyzer {
	int counter =0;
	int retryLimit =4;
	
	public boolean retry(ITestResult result) {
		if(counter < retryLimit)
		{
			counter++;
			return true;
		}
		return false;
	}

}
