package week5.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	
	
	public static String[][] readExcelData(String fileName) throws IOException {
		
		//Step1 : Open the work book(Excel file)
		XSSFWorkbook workBook = new XSSFWorkbook("./data/"+fileName+".xlsx"); 
		// Step2 : Open the sheet (either by using Sheet name or by using sheet index)
		XSSFSheet sheet = workBook.getSheetAt(0); // by using index
		// Step3 : Get the row count
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row count "+rowCount);
		
		short columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column count "+columnCount);
		
				
		
		String[][] data = new String[rowCount][columnCount];
		
		
		//Iterate the row first
		for(int i=1; i<=rowCount; i++) {
			
			// Iterate the column
			for(int j =0; j<columnCount; j++) {
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j] = stringCellValue;
				
			}
			
		}
		
		
		workBook.close();
		
		
		return data;
	}
	
}
