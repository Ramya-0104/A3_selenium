package basic_script;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ss2
{
public static void main(String[] args) throws InterruptedException, IOException
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(4000);
    Date d=new Date();
    String d1 = d.toString().replace(":", "-");
	//Thread.sleep(2000);
	TakesScreenshot ts=(TakesScreenshot)driver;
    WebElement section =driver.findElement(By.xpath("//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials']"));
	File temp=section.getScreenshotAs(OutputType.FILE);
	File perm=new File("./screenshot/D3.png");
	FileHandler.copy(temp, perm);
	System.out.println(d1);
	driver.quit();
}
}
