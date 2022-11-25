package nov23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadData {

	public static void main(String[] args) throws IOException {
		String excelFilePath=".\\Datafiles\\Countries.xlsx";
		FileInputStream inputstream=new FileInputStream(excelFilePath);
XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
XSSFSheet sheet=workbook.getSheet("Sheet1");
int rows=sheet.getLastRowNum();
	}

}
