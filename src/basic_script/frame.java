package basic_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/ramya/OneDrive/Desktop/selenium/frames/mainpage.html");
	WebElement usn = driver.findElement(By.className("t1"));
	usn.sendKeys("admin");
	Thread.sleep(2000);
	//driver.switchTo().frame(0);
	WebElement f=driver.findElement(By.xpath("//iframe[@src='frame1.html']"));
	driver.switchTo().frame(f);
	WebElement psw = driver.findElement(By.className("t2"));
	psw.sendKeys("admin123");
	driver.switchTo().frame("f2");
	WebElement mb= driver.findElement(By.className("t3"));
	mb.sendKeys("123664812");
	driver.switchTo().parentFrame();
	
}

}

