 
package basic_script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlInReverseOrder 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		   List<WebElement> links =  driver.findElements(By.xpath("//a"));
		 
		int count=links.size();
		   for(int i=count-1;i>=0;i--)
		   {
			  WebElement link = links.get(i);
			  String url=link.getAttribute("href");
			  		System.out.println(url);
		   }
		   Thread.sleep(2000);
		   driver.quit();
		   }
		   }
