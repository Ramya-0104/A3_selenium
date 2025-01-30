
package Test_NG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assertion 
{

		@Test
	public void soft() throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			String ER = "Facebook – log in or sign up";
			String AR = driver.getTitle();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals( AR,  ER);
			System.out.println(AR);
			System.out.println(ER);
			Thread.sleep(2000);
			driver.quit();
			sa.assertAll();
	}
}
