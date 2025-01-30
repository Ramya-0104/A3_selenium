package basic_script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement lgnbtn =driver.findElement(By.name("login"));
	 String eletext = lgnbtn.getText();
	 Thread.sleep(2000);
	//usn.sendKeys(Keys.CONTROL+"A");
System.out.println(eletext);
	 Thread.sleep(2000);
	//usn.sendKeys(Keys.DELETE);
	
}
}

