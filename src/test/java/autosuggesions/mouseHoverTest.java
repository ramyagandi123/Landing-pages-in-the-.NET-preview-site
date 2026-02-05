package autosuggesions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mouseHoverTest {
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new WebDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com/");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement electronics=driver.findElement(By.xpath("//li/a[text()='Electronics']"));
		Actions action=new Actions();
		driver.findElement(By.xpath(""));
		if(driver.getTitle().contains("Apple"));
		System.out.println("pass");
		else
			System.out.println("fail");
	}
		driver.close();
	}
		
	


