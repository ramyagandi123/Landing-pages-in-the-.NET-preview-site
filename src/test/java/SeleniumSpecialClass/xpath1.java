package SeleniumSpecialClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("ramya");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("123456@hello");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("//a[text()='Forgotten password?']"));
		//Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.close();
	}

}
