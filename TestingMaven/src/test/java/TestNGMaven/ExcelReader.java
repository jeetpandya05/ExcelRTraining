package TestNGMaven;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	

	public static void main(String[] args) throws IOException {

		String filePath = "./src/test/java/TestNGMaven/TestData.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook(filePath);
		XSSFSheet sheet = workbook.getSheet("data");
		
		//1st style
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
		
		
		//2nd style
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		for (int row = 0; row < rowCount; row++) {
			for (int col = 0; col < colCount; col++) {
				System.out.println(sheet.getRow(row).getCell(col).getStringCellValue());
			}
		}
	}

}
