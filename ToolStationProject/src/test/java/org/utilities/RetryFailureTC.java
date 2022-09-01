package org.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailureTC implements IRetryAnalyzer {
	int min = 0;
	int max = 3;

	public boolean retry(ITestResult result) {
		if (min < max) {
			min++;
			return true;
		}

		return false;
	}

}
