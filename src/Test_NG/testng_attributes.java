package Test_NG;

import java.util.concurrent.PriorityBlockingQueue;

import org.testng.Assert;
import org.testng.annotations.Test;




public class testng_attributes 
{
@Test(enabled = false)
public void signup()
{
	
	System.out.println();
}
	@Test(priority=1)
	public void login()
	
	{
		System.out.println("login");
	}
	@Test(priority=2)
	public void homepage()
	{
		System.out.println("homepage");
	}
	@Test(priority=3)
	public void logout()
	{
		System.out.println("logout");
	}
}

