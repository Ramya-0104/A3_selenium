package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class genericScript 
{
	WebDriver driver;
	@BeforeMethod
public void LaunchApplication()
{
		System.setProperty("webdriver.chrome.driver","./Sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
}
	public void CloseApplication()
	{
		driver.quit();
	}
}
