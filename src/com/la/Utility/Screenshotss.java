package com.la.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Screenshotss {
	
	
	public static WebDriver driver;
	
	public static void takeScreenshotatLogin(WebDriver driver,String dir,String SnapName) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src =  ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File(dir+"\\"+SnapName));
		
		System.out.println("Screenshot taken");
		
		
		
	}

}
