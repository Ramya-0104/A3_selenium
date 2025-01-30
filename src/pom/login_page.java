package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page 

{
	//declartion
	@FindBy(id="email")
	private WebElement usn;

	@FindBy(id="pass")
	private WebElement psw;

	@FindBy(name="login")
	private WebElement login;

	//intialization
	public login_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//utilization
	public void enterusn()
	{
		usn.sendKeys("admin");
	}
	public void enterpsw()
	{
		psw.sendKeys("admin@123");
	}
	public void clicklogin()
	{
		login.click();
	}




}
