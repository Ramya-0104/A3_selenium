package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readData
{
public static void main(String[] args) throws IOException
{
	FileInputStream fis =new FileInputStream("./excel/facebook credentials.xlsx");
	XSSFWorkbook book=new XSSFWorkbook(fis);
	 XSSFSheet sheet = book.getSheet("Sheet1");
	 
	  XSSFRow row = sheet.getRow(1);
	   XSSFCell cell = row.getCell(0);
	   XSSFCell cell1 = row.getCell(1);
	  String usn = cell.getStringCellValue();
	  String psw = cell1.getStringCellValue();
	  
	   XSSFRow row1 = sheet.getRow(2);
	   XSSFCell cell2 = row1.getCell(0);
	   XSSFCell cell3 = row1.getCell(1);
	   String usn1 = cell2.getStringCellValue();
	   String psw1 = cell3.getStringCellValue();
	  
	  System.out.println(usn+" "+psw);
	 System.out.println(usn1+" "+psw1);
	  book.close();
	  fis.close();
}

}
