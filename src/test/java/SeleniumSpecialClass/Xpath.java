package SeleniumSpecialClass;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/a.exe");
		//
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://demowebshop.tricentis.com/fictio");
	      //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           driver.findElement(By.xpath("//a[text()='Register']")).click();
           Thread.sleep(2000);
           driver.findElement(By.xpath("//input[@id='gender-female']")).click();
           Thread.sleep(2000);
           driver.findElement(By.id("FirstName")).sendKeys("ramya");
           Thread.sleep(2000);
           driver.findElement(By.id("LastName")).sendKeys("gandi");
           Thread.sleep(2000);
           driver.findElement(By.id("Email")).sendKeys("vani23@gmail.com");
           Thread.sleep(2000);
           driver.findElement(By.id("Password")).sendKeys("1234567890");
           Thread.sleep(2000);
           driver.findElement(By.id("ConfirmPassword")).sendKeys("1234567890");
           Thread.sleep(2000);
           driver.findElement(By.id("register-button")).click();
           Thread.sleep(2000);
           driver.navigate().to("https://www.google.com/");
           
	    driver.close() ;
           
	}

}
