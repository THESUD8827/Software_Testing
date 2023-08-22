package Package1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_EF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Sudhanshu singh\\eclipse-workspace\\Selenium\\Excelsheet\\Sudexcelsheet.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s1 = wb.getSheet("Login");
		Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);
		String Username = c1.getStringCellValue();
		System.out.println(Username);
	}

}
