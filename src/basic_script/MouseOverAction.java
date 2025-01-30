package basic_script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		    WebElement fashion = driver.findElement(By.xpath("//span[.='Fashion']"));
		 Actions a=new Actions(driver);
		 a.moveToElement(fashion).perform();
	WebElement Login = driver.findElement(By.xpath("//span[.='Login']"));
	 //Actions a=new Actions(driver);
	 a.moveToElement(Login).perform();
}
}


