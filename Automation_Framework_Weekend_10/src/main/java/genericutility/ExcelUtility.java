package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	/**
	 * This method is used to read string data from the excel for the given sheetname and row and column index
	 * @param sheename
	 * @param rowIndex
	 * @param colIndex
	 * @return value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getStringDataFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getStringCellValue();
	}
	
	public boolean getBooleanDataFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
	}
	
	public double getnumberDataFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
	}
	
	public LocalDateTime getDateFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();
	}
	
}
