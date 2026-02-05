package SeleniumSpecialClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullWebPagescreenshot {
	
	System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.swiggy.com/?");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Object shootingStrategies;
	Screenshot ss=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
	ImageIO.write(ss.getImage(),"PNG",new File("./Screenshots/fullpage.png"));
	Thread.sleep(3000);
	driver.close();
}
