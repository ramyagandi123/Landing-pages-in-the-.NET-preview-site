package autosuggesions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mousehover1 {

		public static void main(String[] args) {
			System.setProperty("WebDriver.chrome.driver","./src/main/resources/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//WebDriver driver=new WebDriver();
			driver.manage().window().maximize();
			driver.get("http://ebay.com/");
			 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebElement electronics=driver.findElement(By.linkText("Electronics"));
			
			Actions action=new Actions(driver);
			action.moveToElement(electronics).perform();
			
			driver.findElement(By.linkText("Apple")).click();
			
			WebElement header = driver.findElement(By.xpath("//h1"));
			if(header.getText().equalsIgnoreCase("Apple"))
				System.out.println("Test Case");
			else
				System.out.println("Test Fail");
			
			driver.close();	
	}

}
