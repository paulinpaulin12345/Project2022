package com.DataDrievn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StudData {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Lenovo\\Desktop\\StudData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		wb.createSheet("UserData").createRow(0).createCell(0).setCellValue("Student ID");
		wb.getSheet("UserData").getRow(0).createCell(1).setCellValue("Student Name");
		wb.getSheet("UserData").getRow(0).createCell(2).setCellValue("Password");
		wb.getSheet("UserData").createRow(1).createCell(0).setCellValue("100210");
		wb.getSheet("UserData").getRow(1).createCell(1).setCellValue("Maha");
		wb.getSheet("UserData").getRow(1).createCell(2).setCellValue("Maha210");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		wb.close();
		System.out.println("Write Succeccfully");
		
	}

}
