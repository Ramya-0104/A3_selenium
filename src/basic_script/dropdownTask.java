package basic_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownTask 
{
public static void main(String[] args) throws InterruptedException 
{
System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
Thread.sleep(2000);
WebElement ele = driver.findElement(By.xpath("(//select[@id='select-multiple-native'])[1]"));
Select s = new Select(ele);
if(s.isMultiple())
{
	s.selectByVisibleText("Winter Coat");
	s.selectByValue("Casual Pants");
	s.selectByValue("Formal Shoes");
	s.selectByValue("Raincoat");
	 driver.findElement(By.xpath("//button[.='Add']")).click();
	 Thread.sleep(2000);
}
WebElement ele1 = driver.findElement(By.xpath("(//select[@id='select-multiple-native'])[2]"));
Thread.sleep(2000);
Select s1 = new Select(ele1);
s1.selectByVisibleText("Winter Coat");
 driver.findElement(By.xpath("(//BUTTON[.='Remove'])")).click();

Thread.sleep(2000);
driver.quit();


}
}

