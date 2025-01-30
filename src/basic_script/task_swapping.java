package basic_script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_swapping
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/ramya/OneDrive/Desktop/swapping%20keys.html");
	WebElement usn =driver.findElement(By.xpath("//input[@type='text']"));
	usn.sendKeys("admin");
	
	// Thread.sleep(2000);
	//usn.sendKeys(Keys.CONTROL+"A");
	//usn.sendKeys(Keys.DELETE);
	
}
}


