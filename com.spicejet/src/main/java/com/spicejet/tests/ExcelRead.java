package com.spicejet.tests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ExcelRead {
	public static void main (String [] args) throws IOException{
		//Path of the excel file
		FileInputStream fs = new FileInputStream("Bianca_TestCase_MyStore.xlsx");
		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		
		System.out.println(sheet.getRow(0).getCell(0));
		
	
		System.out.println(sheet.getRow(0).getCell(1));
		

		System.out.println(sheet.getRow(1).getCell(0));
		
	
		System.out.println(sheet.getRow(1).getCell(1));
		
		String cellval = cell.getStringCellValue();
		System.out.println(cellval);
		
   
		
		
		
		
		
		int i1=0;
		int k1 = 0;
		while (sheet.getRow(i1).getCell(k1)!=null) {
																		//row is left or right and cell is up and down.
				System.out.println(sheet.getRow(i1).getCell(k1));
				k1++;
				while (sheet.getRow(i1).getCell(k1)==null) {
					
					i1++;
					k1=0;
				}
		
		}
		
		
		
		
		
		
		
		int i=0;
		int k = 0;
		while (sheet.getRow(i).getCell(k)!=null) {
																		//row is left or right and cell is up and down.
				System.out.println(sheet.getRow(i).getCell(k));
				k++;
				while (sheet.getRow(i).getCell(k)==null) {
					i++;
					k=0;
				}

				
//				Cell userName = sheet.getRow(1).getCell(0);
//			    String orderID1=userName.toString();
				
//		 int i=0;
//			for (Cell row : sheet.getRow(i)) {
//				System.out.println(row);
//				System.out.println();
//				i++;
//			}
//			for (Row cell : sheet) {
//				
//			}
		
		
		}
	}
}