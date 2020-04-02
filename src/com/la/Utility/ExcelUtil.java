package com.la.Utility;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.management.RuntimeErrorException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.la.config.Config;
import com.la.stepDef.LeaseAccelaratorSearchStepDef;

public class ExcelUtil {
	
	
	protected static XSSFWorkbook wb;
	protected static XSSFSheet sheet;
	protected static XSSFRow row;
	protected static XSSFCell cell;
	protected static FileInputStream fileInput;
	protected static FileOutputStream fileOutput;
	PropertiesFileReader obj =new PropertiesFileReader();
	Properties prop = obj.redProperties();
	
	public static void gotoFilePath(String filePath, String sheetName) {
				
		try {
			
		fileInput= new FileInputStream(filePath);
		
		wb= new XSSFWorkbook(fileInput);
		
		sheet = wb.getSheet(sheetName);
		}
		
		
		catch (Exception e) {
			
			throw new RuntimeException("Not able to find the file"+e.getMessage());
		}
		
}
	
	
	public static String readData(int rowNum,int cellNum) {
		
		
		String getData= sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		
		System.out.println(getData);
		
		return getData;
	}
	
	public static void writeResult(int rowNum,int cellNum,String resultCell) {
		
		row=sheet.getRow(rowNum);
		
		cell=row.getCell(cellNum);
		
		try {
		
		if (cell==null) {
			
			cell=row.createCell(cellNum);
			
			cell.setCellValue(resultCell);
			
			
		}
		
		else {
			
			cell.setCellValue(resultCell);
		}
		
		fileOutput = new FileOutputStream(Config.filePaths);
		
		wb.write(fileOutput);
		}
		
		catch (Exception e) {
			
			throw new RuntimeException("Not able to update the result in file"+e.getMessage());
		}
		
		finally {
			
		try {
			
			fileOutput.flush();
		} 
		
		catch (IOException e) {
			
			
			e.printStackTrace();
		}
		}
		
	}
	

}








