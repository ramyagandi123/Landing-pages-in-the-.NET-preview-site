package rivirtualLoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AgentBusinessCardButton {
	@Test
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".\"C:\\Users\\Dell\\Downloads\\chrome-mac-x64\\NEW ONE\"/src/main/resources/Screenshot/CUsersDellDownloadschrome-win32chrome-win32resources.pak.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://rivirtual.net/usa/");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[@class=\"opening-close\"]")).click();
          Thread.sleep(2000);
	      driver.findElement(By.xpath(" //a[text()=\" Agents \"]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//*[@value=\"Search\"]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[text()=\"View Profile\"]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[@href=\"https://rivirtual.net/usa/business-card/alexander-william-228-Nevada%20City\"]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[text()=\"Sign In\"]")).click();
          Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@value=\"realtoravttyp\"]")).click();
          Thread.sleep(2000);
	      driver.findElement(By.xpath("//a[text()=\"Continue\"]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.name("agentusername")).sendKeys("ramya92@rivirtuals.com");
          Thread.sleep(2000);
	      driver.findElement(By.name("agentloginpassword")).sendKeys("......");
	      Thread.sleep(2000);
	      driver.findElement(By.id("agentloginbtn")).click();
	      Thread.sleep(2000);
	     
	     
}
}
