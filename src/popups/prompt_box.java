package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prompt_box 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.id("buttonAlert1")).click();
   Alert pp = driver.switchTo().alert();
   //pp.sendKeys("yes");
   //pp.accept();
  // pp.dismiss();
   String text = pp.getText();   
   System.out.println(text);
   driver.quit()
;}
}
