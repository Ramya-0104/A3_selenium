import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskScrollTillParticularElement 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/scroll/newTabVertical");
	Thread.sleep(2000);
	WebElement abc = driver.findElement(By.xpath("//h2[.='Third party advertisements']"));
	Thread.sleep(2000);
	Point loc = abc.getLocation();
	Thread.sleep(2000);
	int x = loc.getX();
	int y = loc.getY();
	Thread.sleep(2000);
	System.out.println(x);
	System.out.println(y);
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Thread.sleep(2000);
	js.executeScript("window.scrollby(40,841)");
	Thread.sleep(2000);
	driver.quit();
	
}
}

