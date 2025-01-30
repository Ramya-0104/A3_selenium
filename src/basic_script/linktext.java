package basic_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ramya/OneDrive/Desktop/netflix.html");
		driver.findElement(By.linkText("Netflix 2024")).click();
		driver.findElement(By.partialLinkText("2024")).click();
		
}
}
