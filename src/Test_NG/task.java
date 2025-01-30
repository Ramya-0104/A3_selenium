package Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class task 
{
	@Test
public void Task() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement usn = driver.findElement(By.id("email"));
	usn.sendKeys("admin");
	Thread.sleep(2000);
	WebElement pwd = driver.findElement(By.id("pass"));
	pwd.sendKeys("admin@123");
	Thread.sleep(2000);
	driver.navigate().refresh();
	usn.sendKeys("admin");
	pwd.sendKeys("admin@123");
	Thread.sleep(2000);
	Thread.sleep(2000);
	driver.quit();
}
}
