package DataDriven_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Particular_ColumnData extends Read_All_Data {
	public static void Read_Particular_ColumnData() throws IOException {
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Mainproject_march22\\TestCase\\Student.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		int rows = s.getPhysicalNumberOfRows();
		System.out.println("The No.of the Rows is:" + rows);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row = s.getRow(i);
			Cell no1 = row.getCell(0);
			CellType type = no1.getCellType();
			if (type.equals(CellType.STRING)) {
				String cellValue = no1.getStringCellValue();
				System.out.println(cellValue);
			} else if (type.equals(CellType.NUMERIC)) {
				double cellValue = no1.getNumericCellValue();
				int value = (int) cellValue;
				System.out.println(value);
			}
		}
		wb.close();
	}

	public static void main(String[] args) throws IOException {
		System.out.println("****Particular Cell Data*****");
		particular_Cell_Data();
		System.out.println("\n****Particular Row Data****");
		Read_Row_Data();
		System.out.println("\n**** Read All Row Data****");
		Read_All_Data();
		System.out.println("\n**** Read Particular Column Data****");
		Read_Particular_ColumnData();

	}
}
