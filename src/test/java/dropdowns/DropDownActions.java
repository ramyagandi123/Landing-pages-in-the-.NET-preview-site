package dropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Computers")).click();
		//WebElemet = driver.findElement(By.linkText("Computers")).click();
		String title=driver.getTitle();
		System.out.println(title);
		//if(s.isMultiple()){
			//s.selectedByIndex();
			//s.selectedByvalue();
		//	s.selectedByvisibleText();
			
		//	Thread.sleep(0);
		//	System.out.println("First selected option");
		//	List<WebElement>selectedptions
			driver.close();
		}
		}


