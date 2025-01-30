package pom;

import org.testng.annotations.Test;

public class tc01 extends genericScript
{
	@Test
	public void login()
	{
		login_page lp=new login_page(driver);
		lp.enterusn();
		lp.enterpsw();
		lp.clicklogin();


	}
}
