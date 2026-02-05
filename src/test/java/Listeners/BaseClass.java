package Listeners;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {
@BeforeSuite
public void suiteConfig() {
	System.out.println("BforeClass");
}
@BeforeTest
public void TestConfig() {
	System.out.println("BforeTest");
}
@BeforeClass
public void ClassConfig() {
	System.out.println("BforeTest");
}
@AfterMethod
public void () {
	System.out.println("BforeTest");
}
}
