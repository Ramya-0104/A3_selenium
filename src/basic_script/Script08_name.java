package basic_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script08_name 
{
	
public static void main(String[] args)
{

	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/ramya/OneDrive/Desktop/netflix.html");
	WebElement link =driver.findElement(By.name("n1"));
	link.click();
	
}
}

