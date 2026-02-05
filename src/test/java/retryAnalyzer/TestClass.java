package retryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@Test(retryAnalyzer = retryAnalyzer.RetryImplimentation.class)
public void demo() {
	System.out.println("demo");
	Assert.fail();
}

	}

}
