package basic_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script13_fbloginbyXpath 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement usn = driver.findElement(By.xpath("//input[@name='email'])"));
	usn.sendKeys("admin");
	WebElement psw = driver.findElement(By.xpath("//input[@type='password'])"));
	psw.sendKeys("admin@123");
	WebElement btn = driver.findElement(By.xpath("//input[@name='login'])"));
	btn.sendKeys("admin@123");
	
}
}
