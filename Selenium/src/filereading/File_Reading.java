package filereading;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class File_Reading 
{

	public static void main(String[] args) throws Exception
	{
		
		//System.setProperties("C:\\Users\\Admin\\Desktop\\fb.xlsx");
		String filepath = "D:\\TestCasesOnFacebook.xlsx";
		
		File file = new File(filepath);
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("SignIn");
		
		XSSFRow row = sheet.getRow(1);
		
		XSSFCell cell = row.getCell(2);
		
		System.out.println(cell.getStringCellValue());
		
		wb.close();
	}

}
