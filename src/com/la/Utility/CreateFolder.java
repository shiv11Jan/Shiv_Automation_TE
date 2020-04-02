package com.la.Utility;

import java.io.File;


import org.joda.time.DateTime;


public class CreateFolder {
	
	/*
	public static void CreateFolderAtEachRun() {
		
		
		String dir = "C:\\Users\\TLP 62\\Documents\\Shiv\\My Work\\Screenshots_Automation\\";
		
		File createFile = new File(dir);
		
		if (!createFile.exists()) {
			
			createFile.mkdir();
			
		}
		
		else {
			
			System.out.println("File not created");
		}
		
		
	}*/
	
	public static String CreateFolderAtEachRun(String FolderName)  {
		
		
	String Workingdir = "C:\\Users\\TLP 62\\Documents\\Shiv\\My Work\\Screenshots_Automation";
	String  dir = Workingdir + File.separator + FolderName+ DateTime.now().toString("yyyy-dd-M--HH-mm-ss");
		
		File createFile = new File(dir);
		
		if (!createFile.exists()) {
			
			createFile.mkdir();
			
		}
		
		else {
			
						System.out.println("File not created");
		}
		return dir;
	}
	
	/*
	public static void deleteFolderBeforeRun() {
		
		String WorkingdirtobeDeleted = "C:\\Users\\TLP 62\\Documents\\Shiv\\My Work\\Screenshots_Automation";
		
		File deleteFile = new File(WorkingdirtobeDeleted);
		
		if (deleteFile.exists()) {
			
			deleteFile.delete();
			
		}
		
	}
*/
	
	/*
	public static String getCurrentDateTime() {
		
		
		String str = null;
		
		try {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
		
		Date date = new Date();
		str = dateFormat.format(date);
		str= str.replace(" ", "").replaceAll("/", "").replaceAll(":", "");
		
		
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
		return str;
		
	}
*/
}
