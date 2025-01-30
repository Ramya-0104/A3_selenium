package basic_script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class taskW_SELENIUMDEV 
{
	public static void main(String[] args) throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		WebElement ele1 = driver.findElement(By.xpath("//a[.='Downloads']"));
		WebElement ele2 = driver.findElement(By.xpath("//a[.='Documentation']"));
		WebElement ele3 = driver.findElement(By.xpath("//a[.='Projects']"));
		WebElement ele4 = driver.findElement(By.xpath("//a[.='Support']"));
		WebElement ele5 = driver.findElement(By.xpath("//a[.='Blog']"));
		ArrayList<WebElement> l=new ArrayList<WebElement>();
		l.add(ele1);
		l.add(ele2);
		l.add(ele3);
		l.add(ele4);
		l.add(ele5);
		Actions a= new Actions(driver);
		Robot r=new Robot();
		for(WebElement wh:l) 
		{
			a.contextClick(wh).perform();
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_T);
		    r.keyRelease(KeyEvent.VK_T);
		    Thread.sleep(2000) ;
		    
		    }
			 Set<String> b = driver.getWindowHandles();
			 for(String tab:b)
			 {
			driver.switchTo().window(tab);
			 String title = driver.getTitle();
			if(title.equals("Projects | Selenium"))
			{
				break;
			}
			 }
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	

}


	

	
