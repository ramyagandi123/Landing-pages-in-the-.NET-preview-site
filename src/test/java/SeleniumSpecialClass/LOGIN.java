package SeleniumSpecialClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOGIN {
public static void main(String[]args)
{
	//launch the browser
	WebDriver driver=new ChromeDriver();
	//navigate to url
	driver.get("https://demowebshop.tricentis.com/");
	//identify the element
	WebElement registerlink=driver.findElement(By.linkText(""));
	
	//print theText
	System.out.println(registerlink.getText());
	//print the tagName
	System.out.println(registerlink.getAttribute("href"));
	//
	System.out.println((registerlink.get
			//print ARial role ** IT IS VERIFY EWTHER IT IS LNK OR TEXT ON BUTTON
			//System.out.println(registerlink.getARialrole());
	
}
}
 