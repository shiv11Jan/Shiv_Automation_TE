package com.la.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileReader {
	
	public  Properties redProperties() {
		
		FileInputStream file = null;
		
		//PropertiesFileReader filereader = new PropertiesFileReader();
		
		Properties prop = new Properties();
		try {
		prop.load(new FileInputStream("resources/browser-config.properties"));
		}
		catch (Exception e) {
			System.out.println("Exception"+e);
		}
		return prop;
	}

}
