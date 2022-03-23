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

public class Read_RowData extends ReadData1 {
	public static void Read_Row_Data() throws IOException {
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Mainproject_march22\\TestCase\\Student.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(2);
		int no = r.getPhysicalNumberOfCells();
		System.out.println("The Length of the Row is:"+no);
		for (int i = 0; i <r.getPhysicalNumberOfCells(); i++) {
			Cell no1 = r.getCell(i);
			CellType type = no1.getCellType();

			if (type.equals(CellType.STRING)) {
				String cellValue = no1.getStringCellValue();
				System.out.println(cellValue);
			} 
			else if (type.equals(CellType.NUMERIC)) {
				double cellValue = no1.getNumericCellValue();
				int value = (int) cellValue;
				System.out.println(value);
			}
			wb.close();

		}
	}

	public static void main(String[] args) throws IOException {
		System.out.println("****Particular Cell Data*****");
		particular_Cell_Data();
		System.out.println("****Particular Row Data****");
		Read_Row_Data();

	}

}
