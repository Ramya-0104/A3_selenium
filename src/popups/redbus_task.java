package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus_task 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement from= driver.findElement(By.id("src"));
		from.sendKeys("Banglore");
		Thread.sleep(2000);
		WebElement to= driver.findElement(By.id("dest"));
		to.sendKeys("Chitradurga");
		WebElement date= driver.findElement(By.id("onwardCal"));
		date.click();
		driver.findElement(By.xpath("//span[.='14']")).click();
		Thread.sleep(2000);
		WebElement search= driver.findElement(By.xpath("//button[.='SEARCH BUSES']"));
		search.click();
		Thread.sleep(2000);
		driver.quit();
}
}
