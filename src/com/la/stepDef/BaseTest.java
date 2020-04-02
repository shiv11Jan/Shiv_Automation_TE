package com.la.stepDef;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.la.Utility.PropertiesFileReader;



public class BaseTest {

	public static WebDriver driver;
	static PropertiesFileReader obj =new PropertiesFileReader();
	 static Properties prop = obj.redProperties();

	public static void setUp() {

		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeDriver"));

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(prop.getProperty("browser.baseUrl"));

	}

}
