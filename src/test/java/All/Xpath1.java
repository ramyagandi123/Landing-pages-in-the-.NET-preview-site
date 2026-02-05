package All;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) {

   System.setProperty("WebDriver.Chrome.driver","./src\\main\\resources\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.zomato.com/");
   driver.close();
	}

}
