package justTest;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchuserdefinedBrowser {

	public static void main(String[] args) {
		System.out.println("Enter your choice");
		Scanner s=new Scanner(System.in);
		String choice=s.next();
		Object webbDriverManager;
		ChromeDriver driver;
		switch (choice) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case"Firefox";
		webbDriverManager.firefoxdrivre().setup();
		driver =new FirefoxDriver();
		break;
		case"edge";
		webbDriverManager.firefoxdrivre().setup();
		driver =new edgeDriver();
		break;
		default:
			System.out.println("Invalid browser info");
			
		
		}
     Thread.sleep(3000);

      driver.close();


	}

}
