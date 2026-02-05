package aivoaassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Deviation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("http://216.48.184.249:5289/login");
			driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("testing@aivoa.net");
			Thread.sleep(200);
			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("password123");
			Thread.sleep(200);
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(200);
			Actions action=new Actions(driver);
			WebElement element1=driver.findElement(By.xpath("//button/span[text()=\"Quality Command\"]"));
			action.moveToElement(element1).perform();
			driver.findElement(By.xpath("driver.findElement(By.xpath(\"//button[@type=\\\"submit\\\"]\")).click();\r\n"
					+ "			Thread.sleep(200);")).click();
			Thread.sleep(200);
			
	}

}
