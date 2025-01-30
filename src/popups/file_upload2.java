package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class file_upload2 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement abc=driver.findElement(By.id("fileInput"));
    abc.sendKeys("C:\\Users\\ramya\\OneDrive\\Desktop\\Ramya R Resume.pdf");
    }
}


