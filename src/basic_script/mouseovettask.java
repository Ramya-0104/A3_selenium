package basic_script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseovettask
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
		Thread.sleep(2000);
		    WebElement mouse_over = driver.findElement(By.xpath("//img[@src='/assets/message-hint-J20Zlhln.png']"));
		 Actions a=new Actions(driver);
		 a.moveToElement(mouse_over).perform();
	
}
}


