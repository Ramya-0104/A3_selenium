package dataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write_MultipleData
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Flipkart");
		for(int i=0;i<count;i++)
		{
			XSSFRow row = sheet.createRow(i);
			XSSFCell cel = row.createCell(0);
			WebElement link = links.get(i);
			  String url = link.getAttribute("href");
			cel.setCellValue(url);
		}
		FileOutputStream fos = new FileOutputStream("./excel/Links.xlsx");
		book.write(fos);
		book.close();
		Thread.sleep(2000);
		driver.quit();
	}

}
