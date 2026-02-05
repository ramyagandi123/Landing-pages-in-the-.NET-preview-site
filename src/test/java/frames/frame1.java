package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame1 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("nav-iss-attach")).click();
		driver.findElement(By.className(null)).sendKeys("head set");
		driver.navigate().back();
		driver.findElement(By.className("//img[@class='s-image']")).sendKeys("gaming head set for PC jbl");
		
		//Actions action =new Actions(driver);
		//action.moveToElement(signIn).perform();
		//driver.findElement(By.xpath("//a[text()='login']")).click();
		//driver.switchTo().frame("loginIframe");
		
		//driver.findElement(By.id("userName")).sendKeys("9876543210");
		//driver.findElement(By.id("")).click();
		driver.close();
	}
}
