package basic_script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameOfAllElements 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		   List<WebElement> eles =  driver.findElements(By.xpath("//*"));
		 for(WebElement elm:eles)
		 {
			 String txt=elm.getTagName();
			 System.out.println(txt);
		 }
		 Thread.sleep(2000);
		 driver.quit();
		
		   }
		   }

