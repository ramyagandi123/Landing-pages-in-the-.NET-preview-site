package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class disablenotifications {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("..disable.geolocation");
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 Thread.sleep(3000);
		 driver.navigate().to("https://www.zomato.com/");
		 Thread.sleep(3000);
		 driver.navigate().back();
		 driver.close();
	}
}
