package basic_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop
{
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
WebElement src = driver.findElement(By.id("box3"));
WebElement dest = driver.findElement(By.id("box103"));
Actions a =new Actions(driver);
a.dragAndDrop(src, dest).perform();
Thread.sleep(2000);
}
}
