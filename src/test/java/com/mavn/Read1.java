package com.mavn;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read1 {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file= new File("C:\\Users\\AVITA\\eclipse-workspace\\MavenFirst\\src\\test\\resources\\Testr\\Testdatadriven.xlsx");
        
		FileInputStream fis = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fis);
		
		Sheet s1= book.getSheet("Sheet1");
		for(int i=0;i<s1.getPhysicalNumberOfRows();i++)
		{
			Row row= s1.getRow(i);
			
			for(int j=0;j<row.getPhysicalNumberOfCells();j++)
			{
				Cell cell =row.getCell(j);
				System.out.println(cell.getCellType());
			}
		}
		
	}

}
