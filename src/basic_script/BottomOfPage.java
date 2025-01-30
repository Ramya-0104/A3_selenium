package basic_script;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BottomOfPage 
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	Thread.sleep(2000);
	driver.quit();
}
}
