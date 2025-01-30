package basic_script;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeDedicatedBrowser 
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://skpatro.github.io/demo/links/");
	driver.findElement(By.name("NewWindow")).click();
	String p_id=driver.getWindowHandle();
	Set<String> allwh = driver.getWindowHandles();

	for(String wh:allwh)
	{
		driver.switchTo().window(wh);
		String title = driver.getTitle();
if(title.equals("About me - qavalidation"))
{
			driver.close();
}
		
	
	
}
}


}
