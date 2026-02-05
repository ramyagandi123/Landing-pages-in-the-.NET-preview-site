package CrossBrowserParllel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	WebDriver driver;
	@Parameters("Browser")
@BeforeClass
public void classconfig(String browser) {
	WebDriver driver=null;
	switch(browser) {
	case "chrome":
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
	    driver =new ChromeDriver();
	    break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;
	case "edge":
		WebDriverManager.firefoxdriver().setup();
		driver = new EdgeDriver();
		break;
		default:
			System.err.println("Invalid broser info");
	}
	driver.manage().window().maximize();
	}
	@AfterClass
	public void 
		

	}
}
}
