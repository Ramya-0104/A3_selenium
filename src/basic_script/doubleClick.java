package basic_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			  WebElement dbc = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
			  Actions a = new Actions(driver);
			  Thread.sleep(2000);
			  a.doubleClick(dbc).perform();
}
}