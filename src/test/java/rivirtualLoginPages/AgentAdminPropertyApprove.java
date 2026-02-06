package rivirtualLoginPages;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class AgentAdminPropertyApprove {
@Test
	
	public static void main(String[] args) throws InterruptedException
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://rivirtual.net/preview/empower/login");
	driver.findElement(By.id("email")).sendKeys("info@rivirtual.net");
	driver.findElement(By.id("password")).sendKeys(".....");
	driver.findElement(By.id("checkbox-signup")).click();
	driver.findElement(By.xpath("//button[@ type=\"submit\"]")).click();
	  // Locate the element containing the number 429951 dynamic element
    WebElement numberElement = driver.findElement(By.xpath("//div[@class='panel-body']//b"));

    // Create Actions class instance
    Actions actions = new Actions(driver);

    // Perform double click
    actions.doubleClick(numberElement).perform();
    WebElement target = driver.findElement(By.xpath("//div[@class='panel-body']//b"));
    
    WebElement target1 = driver.findElement(By.xpath("//input[@type=\"text\"]"));

    WebElement source = driver.findElement(By.xpath("//b"));
    actions.dragAndDrop(source, target1).perform();
    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    driver.findElement(By.xpath("/html//body//div[2]//div[2]//span[text()=\" Manage Property\"]")).click();
   

   
    
    
    
	}
}
