package retryAnalyzer;

import org.testng.ITestResult;

public class RetryImplimentation impliments IRetryAnalyzer{
	int count;
	int maxRetries = 3;
	public boolean retry(ITestResult result) {
		if(count < maxRetries) {
			count++;
			return true;
			
		}
	return false;
		}{

}
