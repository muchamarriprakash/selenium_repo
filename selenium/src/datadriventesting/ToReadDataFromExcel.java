package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExcel 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//	step1: create FileInputStream Object
		FileInputStream fis = new FileInputStream("./Testdata/Excel.xlsx");

		//	step2: create respective file type object
		Workbook workbook = WorkbookFactory.create(fis);

		//	step3: call read method
		String name = workbook.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		System.out.println(name);
		
		//phoneno
		long phoneno = (long) workbook.getSheet("login").getRow(1).getCell(1).getNumericCellValue();
		System.out.println(phoneno);

		//email
		String email = workbook.getSheet("login").getRow(1).getCell(2).getStringCellValue();
		System.out.println(email);

		//password
		String password = workbook.getSheet("login").getRow(1).getCell(3).getStringCellValue();
		System.out.println(password);

		//numeric
		double price = workbook.getSheet("login").getRow(1).getCell(4).getNumericCellValue();
		System.out.println(price);

		//status
		boolean status = workbook.getSheet("login").getRow(1).getCell(5).getBooleanCellValue();
		System.out.println(status);

		//date
		LocalDateTime date = workbook.getSheet("login").getRow(1).getCell(6).getLocalDateTimeCellValue();
		System.out.println(date);
	} 
}
