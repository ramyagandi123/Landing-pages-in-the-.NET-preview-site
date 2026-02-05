package All;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FuncionalTesting {
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver",".src/main/resources/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.dealsdray.com/");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prexo.mis@dealsdray.com");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("prexo.mis@dealsdray.com");
				Thread.sleep(2000);
				driver.findElement(By.name("Login")).click();//div[contains(text().'Upload Resume')]
				//driver.findElement( By.id("")).sendKeys("enter file path and remove  /");//file-upload
				//Thread.sleep(3000);
				driver.close();
	}

}
