package basic_script;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script12_map 
{
public static void main(String[] args) 
{
	
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/maps/@13.0012817,77.5487917,15z?entry=ttu&g_ep=EgoyMDI0MTIwMS4xIKXMDSoASAFQAw%3D%3D");
	driver.findElement(By.cssSelector("span[class='google-symbols NhBTye G47vBd']")).click();
	driver.findElement(By.cssSelector("input[class='tactile-searchbox-input']")).sendKeys("peenya");
//	Thread.sleep(2000);
	
//	driver.findElement(By.cssSelector("input[aria-controls='sbsg51'])");
}
}
