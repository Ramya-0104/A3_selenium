package basic_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script03_usingUpcasting 
{
	public static void main(String[] args)
	{
	String key=	"webdriver.chrome.driver";
	String value="./Software/chromedriver.exe";
	System.setProperty(key,value);
	WebDriver driver=new ChromeDriver();
	}
}
