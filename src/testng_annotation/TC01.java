package testng_annotation;

import org.testng.annotations.Test;

public class TC01 extends genericScript
{
	@Test
	public void Title()
{
String title = driver.getTitle();
 System.out.println(title);
}
}

