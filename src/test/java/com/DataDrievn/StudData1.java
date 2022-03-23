package com.DataDrievn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StudData1 {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Lenovo\\Desktop\\StudData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		wb.createSheet().createRow(0).createCell(0).setCellValue("Student ID");
		System.out.println("Row Created");
		wb.getSheet("Sheet1").getRow(0).createCell(1).setCellValue("password");
		wb.getSheet("Sheet1").getRow(0).createCell(2).setCellValue("name");
		System.out.println("successfully");
		

}
}
