package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class childpopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/#");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='GEARS']")).click();
		driver.findElement(By.xpath("//a[text()=' SkillRary Essay']")).click();
        
		
		String parentId=driver.getWindowHandle();
       Set<String> ids= driver.getWindowHandles();
        for(String wid:ids) {
        	driver.switchTo().window(wid);	
        }
        driver.findElement(By.id("mytext")).sendKeys("Ramya");
        driver.findElement(By.xpath("//input[@value=\\\"Yes It's My Name\"]")).submit();
        
        driver.switchTo().window(parentId);
        driver.findElement(By.name("q")).sendKeys("core java");
        driver.findElement(By.xpath("//input[@type='submit']"));
        
        Thread.sleep(2000);
        driver.close();
        
        
	}

}
