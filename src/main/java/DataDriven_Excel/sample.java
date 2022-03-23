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

public class sample {
	public static void particular_Cell_Data(int rowindex,int cellindex) throws IOException {
		File f = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Mainproject_march22\\TestCase\\Student.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(rowindex);
		Cell c = r.getCell(cellindex);
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {
			String cellValue = c.getStringCellValue();
			System.out.println(cellValue);
		} else if (type.equals(CellType.NUMERIC)) {
			double cellValue = c.getNumericCellValue();
			int value = (int) cellValue;
			System.out.println(value);
		}
		wb.close();

	}

	public static void main(String[] args) throws IOException {
		System.out.println("Particular Cell Data");
		particular_Cell_Data(1,0);
		particular_Cell_Data(1,1);

	}


}
