package basic_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class adressOfParentBrowser
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://skpatro.github.io/demo/links/");
	String p_id=driver.getWindowHandle();
	//driver.findElement(By.xpath("//input[id='search']")).sendKeys("BTS");
	System.out.println(p_id);
}
}
