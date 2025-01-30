package Assessment;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase 
{
public static void main(String[] args) throws Exception  {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	WebElement usn =driver.findElement(By.xpath("//input[@placeholder='Username']"));
	usn.sendKeys("Admin");
	Thread.sleep(2000);
	WebElement pwd =driver.findElement(By.xpath("//input[@placeholder='Password']"));
	pwd.sendKeys("admin123");
	WebElement btn =driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
	btn.click();
	Thread.sleep(2000);
	WebElement pim =driver.findElement(By.xpath("//span[.='PIM']"));
	pim.click();
	Thread.sleep(2000);
	WebElement adata =driver.findElement(By.xpath("//li[.='Add Employee']"));
	adata.click();
	Thread.sleep(2000);
	WebElement frstnme =driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	frstnme.sendKeys();
	
	
	
	
	FileInputStream fis =new FileInputStream("./excel/TestCase1.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(fis);
	 XSSFSheet sheet = book.getSheet("Sheet1");
	 
	  XSSFRow row = sheet.getRow(1);
	   XSSFCell cell = row.getCell(0);
	   XSSFCell cell1 = row.getCell(1);
	   XSSFCell cell2 = row.getCell(2);
	  String FN = cell.getStringCellValue();
	  String MN = cell1.getStringCellValue();
	  String LN = cell2.getStringCellValue();
	
	
	
	
	
	
	
	
	
	
	
	
	
	driver.quit();
}
}
