package SeleniumSpecialClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class mouseActions {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","/.src/main/resources/chromedriver.exe");
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findelement(By.linkText(" Computers\r\n"
				+ "        ")).click();
		
		driver.close();

	}

}
