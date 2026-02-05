package autosuggesions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.findElement(By.id("APjFqb")).sendKeys("dress");
		List<WebElement> autosuggesions=driver.findElements(By.xpath("//span[text()=\"dress\"]"));
		Thread.sleep(3000);
		for(int i=0;i<autosuggesions.size();i++) {
			String text=autosuggesions.get(i).getText();
			System.out.println(text);
			
		}
		driver.close();
	}

	private static Object xpath(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
