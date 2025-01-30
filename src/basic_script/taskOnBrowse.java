package basic_script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class taskOnBrowse 
{
public static void main(String[] args) throws InterruptedException, AWTException
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/?authuser=0");
	WebElement btn = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
	Thread.sleep(2000);
	Actions a=new Actions(driver);
	a.contextClick(btn).perform();
	Thread.sleep(2000);
    Robot r = new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    Set<String> allwh = driver.getWindowHandles();
    for(String wh:allwh)
	{
	System.out.println(wh);
 ArrayList<String> l=new ArrayList<String> ( allwh);
 String s = l.get(1);
 driver.switchTo().window(wh);
 
}
    
	
}
}
