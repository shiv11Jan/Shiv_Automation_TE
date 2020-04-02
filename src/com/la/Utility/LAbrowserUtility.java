package com.la.Utility;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;



public class LAbrowserUtility {
	

	WebDriver driver;
	
	public static WebDriver utilbrowser(WebDriver driver,String browserName,String url)
	
	{
	if (browserName.equalsIgnoreCase("chrome")) {
	
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\TLP 62\\Documents\\Shiv\\Drivers\\chromedriver.exe");
	
	driver= new ChromeDriver();
	
}
else if (browserName.equalsIgnoreCase("ie")) {
	
	DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
	  
	capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
	capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
	System.setProperty("webdriver.ie.driver","C:\\Users\\TLP 62\\Documents\\Shiv\\Drivers\\IEDriverServer.exe");
	
	driver = new InternetExplorerDriver();
	driver.manage().window().maximize();
	driver.get(url);
	return driver;

}
	return null;
}
	}