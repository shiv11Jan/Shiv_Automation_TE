package com.la.Utility;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import javax.management.RuntimeErrorException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.DateTime;
import org.testng.annotations.Test;

import com.la.config.Config;
import com.la.stepDef.LeaseAccelaratorSearchStepDef;

public class ExcelUtil_TestSummary {
	
	
	protected static Workbook wb;
	//protected static XSSFSheet sheet;
	//protected static XSSFRow row;
	//protected static XSSFCell cell;
	protected static FileInputStream fileInput;
	protected static FileOutputStream fileOut;
	//PropertiesFileReader obj =new PropertiesFileReader();
	//Properties prop = obj.redProperties();
	public static int lastRow;

	
	/*
	public static void gotoFilePath(String filePath, String sheetName) {
				
		try {
			
		fileInput= new FileInputStream(filePath);
		
		wb= new XSSFWorkbook(fileInput);
		
		sheet = wb.getSheet(sheetName);
		
		sheet.getLastRowNum()
		}
		
		
		catch (Exception e) {
			
			throw new RuntimeException("Not able to find the file"+e.getMessage());
		}
		
}
	
	*/
	
	
	public static void createWorkbook() {
		
		try {
		
		fileInput= new FileInputStream(Config.TestSummaryExcelPath);
		
		wb = WorkbookFactory.create(fileInput); 
		//String getData= sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		
		//System.out.println(getData);
		
		//return getData;
		}
		
		catch (IOException | InvalidFormatException e) {

				e.printStackTrace();
				
		}
	}
	
	   	public static void setTestName() {
	   		
	   		TestSummary obj = new TestSummary();
	   		obj.setTestCase("LoginTest");
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now(); 
			   
			obj.setStartTime(dtf.format(now));

			Sheet sheet1 = wb.getSheetAt(0);
		    lastRow = sheet1.getLastRowNum();
			Row row = sheet1.createRow(++lastRow); 
			row.createCell(0).setCellValue(obj.getTestCase()+"");
	   	}
	
	public static void writeTestSummary() throws IOException {
		
		TestSummary obj = new TestSummary();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now(); 
		obj.setEndTime(dtf.format(now));
		
		Sheet sheet1 = wb.getSheetAt(0);
	    lastRow = sheet1.getLastRowNum();
		Row row = sheet1.createRow(++lastRow); 
		//row.createCell(0).setCellValue(obj.getTestCase()+"");
		row.createCell(1).setCellValue(obj.getStartTime());
		row.createCell(2).setCellValue(obj.getEndTime());
		
		
		try {
			fileOut = new FileOutputStream(Config.TestSummaryExcelPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	    wb.write(fileOut); 
	    fileOut.close();
		
	}
	
	
	
}








