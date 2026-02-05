package mouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassTest {

	public static void main(String[] args) throws AWTException {
		System.setProperty("WebDriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new WebDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement deals=driver.findElement(By.xpath(""));
		   Actions action=new Actions(driver);
		   action.contextClick(deals).perform();
		   Robot r=new Robot();
		   r.keyPress(KeyEvent.VK_RIGHT);
		   r.keyRelease(keyEvent);
		   Thread.sleep(2000);
		   driver.close();

	}

}
