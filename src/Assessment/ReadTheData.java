package Assessment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTheData 
{
	public static void main(String[] args) throws IOException
	{
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
		  
		  /* XSSFRow row1 = sheet.getRow(2);
		   XSSFCell cell3 = row1.getCell(0);
		   XSSFCell cell4 = row1.getCell(1);
		   String  FN1 = cell2.getStringCellValue();
		   String MN1 = cell3.getStringCellValue();
		   String LN1 = cell3.getStringCellValue();*/
		   
		  
		  System.out.println(FN+" "+MN+" "+LN);
		  book.close();
		  fis.close();
	}

	}

