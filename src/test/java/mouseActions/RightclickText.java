package mouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new WebDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement location=driver.findElement(By.name("login"));
      //location.sendKeys("chait");
   Actions action=new Actions(driver);
   action.moveToElement(location).click().perform();
   keyDown

   Thread.sleep(2000);
   driver.close();
	};

}
