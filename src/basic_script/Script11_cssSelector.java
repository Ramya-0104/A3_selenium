package basic_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script11_cssSelector 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/ramya/OneDrive/Desktop/sample1.html");
	WebElement usn= driver.findElement(By.cssSelector("input[type='text']"));
	usn.sendKeys("admin");
	WebElement cb= driver.findElement(By.cssSelector("input[type='checkbox']"));
	cb.click();
	WebElement rb= driver.findElement(By.cssSelector("input[name='rd']"));
	rb.click();
	WebElement lnk= driver.findElement(By.cssSelector("a[class='link']"));
	lnk.click();
}
}
