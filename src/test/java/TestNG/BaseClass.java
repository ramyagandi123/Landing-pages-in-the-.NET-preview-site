package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
@BeforeSuite
public void suiteconfig()
{
	System.out.println("BefoteSuite");
}
@BeforeClass
public void Classeconfig()
{
	System.out.println("BefoteClass");
}
@BeforeMethod
public void Methodconfig()
{
	System.out.println("BeforeMethod");
}
@AfterMethod
public void MethodTeareDown()
{
	System.out.println("afterMethod");
}
@AfterClass
public void ClassTeareDown()
{
	System.out.println("afterClass");
}
@AfterTest
public void testTeareDown()
{
	System.out.println("AfterTest");
}
@AfterSuite
public void suitTeareDown()
{
	System.out.println("AfterSuite");
}
}
