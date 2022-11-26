package TestNGMaven;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderadv {

	static String filePath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	public ExcelReaderadv() throws IOException {
		filePath = "./src/test/java/TestNGMaven/TestData.xlsx";
		workbook = new XSSFWorkbook(filePath);
		sheet = workbook.getSheet("data");
	}
	
	public int rowCount() {
		return sheet.getPhysicalNumberOfRows();	
	}
	
	public int colCount() {
		return sheet.getRow(0).getLastCellNum();
	}
	
	public String getValue(int row, int col) {
		return sheet.getRow(row).getCell(col).getStringCellValue();
	}
	
	public Object[][] getData() {
		Object[][] data = new Object [rowCount()][colCount()];
		
		for (int row = 0; row < rowCount(); row++) {
			for (int col = 0; col < colCount(); col++) {
				data[row][col] = getValue(row, col);
				
			}
			
		}
		return data;
	}
	
}
