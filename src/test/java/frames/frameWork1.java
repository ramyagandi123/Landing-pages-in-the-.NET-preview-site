package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameWork1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.switchTo().frame(0);
driver.findElement(By.xpath(null)).click();////button[text()='stay signed out']"))
driver.switchTo().defaultContent();
driver.findElement(By.name("q")).sendKeys("selenium"+Keys.ENTER);
Thread.sleep(4000);
driver.close();
}

}
