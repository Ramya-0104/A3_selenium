package testng_annotation;

import org.testng.annotations.Test;

public class TC02 extends genericScript
{
	@Test
public void currentURl()

{
String url = driver.getCurrentUrl();
System.out.println(url);
}
}

