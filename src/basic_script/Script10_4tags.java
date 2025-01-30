package basic_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10_4tags 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/ramya/OneDrive/Desktop/sample1.html");
	WebElement usn =driver.findElement(By.tagName("input"));
	usn.sendKeys("admin");
	 Thread.sleep(2000);
	WebElement box =driver.findElement(By.id("cb"));
	box.click();
	 Thread.sleep(2000);
	WebElement rb =driver.findElement(By.name("rd"));
	rb.click();
    Thread.sleep(2000);
	WebElement link =driver.findElement(By.className("link"));
	link.click();
	 Thread.sleep(2000);
	 driver.quit();
}
}
