package autosuggesions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mobilewithprice {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new WebDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElements(By.xpath("")).Click();
		driver.findElements(By.name("q")).sendKeys("mobiles");
		
		driver.findElements(By.className("_4rR01T")).Click();
		List<WebElement> mobileNames=driver.findElements(By.className("_4rR01T"));
		for(int i=1;i<mobileNames.size();i++) {
				String name=mobileNames.get(i).getText();
				String price=driver.findElements(By.xpath(price)).getText();
				System.out.println(name+"\t"+price);
	            }
		driver.close();

}
}
