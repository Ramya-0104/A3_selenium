package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload_file
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/ramya/OneDrive/Desktop/selenium/file_upload_pup.html");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement abc= driver.findElement(By.id("f1"));
    abc.sendKeys("C:\\Users\\ramya\\OneDrive\\Desktop\\Ramya R Resume.pdf");
    }
}
