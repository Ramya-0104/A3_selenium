package basic_script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextOfLLtheLinks 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		   List<WebElement> links =  driver.findElements(By.xpath("//a"));
		 for(WebElement link:links)
		 {
			 String txt=link.getText();
			 System.out.println(txt);
		 }
		 Thread.sleep(2000);
		 driver.quit();
		
		   }
		   }

