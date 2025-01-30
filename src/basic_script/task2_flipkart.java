package basic_script;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2_flipkart 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
	WebElement btn = driver.findElement(By.xpath("//div[.='Apple iPhone 15 (Green, 128 GB)']"));
	btn.click();
	Set<String> allwh = driver.getWindowHandles();
	ArrayList<String> ele = new ArrayList<String>(allwh);
	String point = ele.get(1);
	driver.switchTo().window(point);
	
	
	
}
}



