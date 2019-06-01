package org.mav.ExcelWord;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Maven {

	public static void main(String[] args) throws IOException {
		
		File loc=new File("C:\\Users\\93ksr\\Bala\\ExcelWord\\Sample\\Maven.xlsx");
		
		FileInputStream stream=new FileInputStream(loc);
		
		Workbook w=new XSSFWorkbook(stream);
		
		Sheet s = w.getSheet("Information");
		
		for(int i=0;i<s.getPhysicalNumberOfRows();i++)
		{
			Row r = s.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				
				Cell c = r.getCell(j);
				System.out.println(c);
			}
		}
		
	}
}
