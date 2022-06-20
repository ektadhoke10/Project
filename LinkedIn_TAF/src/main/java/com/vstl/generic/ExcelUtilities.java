package com.vstl.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities {
	private static HSSFWorkbook objWorkbook;
	private static HSSFSheet objSheet;
	private static HSSFCell objCell;

	public void setExcelFile(String strExcelFilePath,String strSheetName) throws IOException {
		//Create an object of File class to open xls file
		File file =    new File(strExcelFilePath);

		//Create an object of FileInputStream class to read excel file
		FileInputStream inputStream = new FileInputStream(file);

		//creating workbook instance that refers to .xls file
		objWorkbook=new HSSFWorkbook(inputStream);

		//creating a Sheet object
		objSheet=objWorkbook.getSheet(strSheetName);

	}

	public String getCellData(int intRowNumber,int intCellNumber){
		//getting the cell value from rowNumber and cell Number
		objCell =objSheet.getRow(intRowNumber).getCell(intCellNumber);

		//returning the cell value as string
		return objCell.getStringCellValue();
	}

	public int getRowCountInSheet(){
		int intRowcount = objSheet.getLastRowNum()-objSheet.getFirstRowNum();
		return intRowcount;
	}

	public void setCellValue(int intRowNum,int intCellNum,String strCellValue,String strExcelFilePath) throws IOException {
		//creating a new cell in row and setting value to it      
		objSheet.getRow(intRowNum).createCell(intCellNum).setCellValue(strCellValue);

		FileOutputStream outputStream = new FileOutputStream(strExcelFilePath);
		objWorkbook.write(outputStream);
	}
	
}
