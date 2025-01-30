package basic_script;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script02_launchEmptyFirefoxBrowser
{
	public static void main(String[] args)
	{
	String key=	"webdriver.gecko.driver";
	String value="./Software/geckodriver.exe";
	System.setProperty(key,value);
    FirefoxDriver driver=new FirefoxDriver();

	}
	}
