package com.la.stepDef;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.la.Utility.CreateFolder;
import com.la.Utility.ExcelUtil;
import com.la.Utility.ExcelUtil_TestSummary;
import com.la.Utility.Screenshotss;
import com.la.Utility.TestSummary;
import com.la.config.Config;
import com.la.pageObjects.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.joda.time.DateTime;



public class SearchStepDef {

	public static WebDriver driver;
	public static Workbook wb;
	public static int lastRow;
	
	//PropertiesFileReader obj = new PropertiesFileReader();
	//Properties prop = obj.redProperties();
	public String dir;
	TestSummary obj = new TestSummary();
	//private static final String FILE_NAME = "C:\\Users\\TLP 62\\Documents\\Shiv\\My Work\\Screenshots_Automation\\TestSummary.xlsx";
    
	/*
	static {
		try {
		InputStream inp = new FileInputStream(FILE_NAME); 
	    wb = WorkbookFactory.create(inp);  
	    
	    
		} catch(IOException | InvalidFormatException e)
		{	// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	*/
	//private static Logger log = LogManager.getLogger(LeaseAccelaratorSearchStepDef.class);
	
	// private static ExtentReports report =null;
	// private static ExtentTest test=null;

	@Given("^user is on HomePage$")
	public void user_is_on_HomePage() throws Throwable {

	/*
		obj.setTestCase("LoginTest");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now(); 
		   
		obj.setStartTime(dtf.format(now));
		*/
		ExcelUtil_TestSummary.createWorkbook();
		ExcelUtil_TestSummary.setTestName();
		
		//ExcelUtil_TestSummary.gotoFilePath(Config.TestSummaryExcelPath, "Sheet1");
		
		//ExcelUtil_TestSummary.writeTestcaseName(1, 0, "LoginTest");
		
		System.setProperty("webdriver.chrome.driver", Config.chromeDriver);

		driver = new ChromeDriver();
		
		
		
		//onjects.add(obj);
		// LAbrowserUtility.utilbrowser(driver, prop.getProperty("browser.name"),
		// prop.getProperty("browser.baseUrl"));
	}

	@When("^user logins to page$")
	public void user_logins_to_page() throws Throwable {

		//obj.setTestCase("LoginTest");
		
		//ExcelUtil_TestSummary.gotoFilePath(Config.TestSummaryExcelPath, "Sheet1");
		
		//ExcelUtil_TestSummary.writeStartTime(1, 1, DateTime.now()+"");
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.get(Config.baseUrl);

		//log.info("Navigated to the baseUrl");
		dir = CreateFolder.CreateFolderAtEachRun("LoginPage");

		Screenshotss.takeScreenshotatLogin(driver, dir, "1.png");

	}

	@When("^enters valid Credentials")
	public void enters_valid_Credentials() throws Throwable {

		ExcelUtil.gotoFilePath(Config.filePaths,"Sheet1");
		
		new LoginPage(driver).loginFunction();

		Screenshotss.takeScreenshotatLogin(driver, dir, "2.png");

		// driver.findElement(By.id("appid")).sendKeys("Acme");

		// driver.findElement(By.id("username")).sendKeys("test_user_s");
		// driver.findElement(By.id("clearPwd")).sendKeys("Lessa@123");
		
	}

	@When("^clicks on the Login button$")
	public void clicks_on_the_Login_button() throws Throwable {

		new LoginPage(driver).clickLogin();
		Screenshotss.takeScreenshotatLogin(driver, dir, "3.png");

	}

	// driver.findElement(By.id("loginout")).click();

	@Then("^Successful login message should be displayed on the console window$")
	public void successful_login_message_should_be_displayed_on_the_console_window() throws Throwable {

		// String expected ="LeaseAccelerator - Acme, Inc. - test_user_s - Home";

		// String actual = driver.getTitle();
		// Assert.assertEquals(actual, expected, "login validation failed");
		// System.out.println(driver.getTitle());

		System.out.println("user is able to login successfully");
		Screenshotss.takeScreenshotatLogin(driver, dir, "4.png");

		driver.close();
		ExcelUtil_TestSummary.writeTestSummary();
		
		//ExcelUtil_TestSummary.gotoFilePath(Config.TestSummaryExcelPath, "Sheet1");
		//ExcelUtil_TestSummary.writeFinishedTime(1, 2, DateTime.now()+"");
		/*
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now(); 
		obj.setEndTime(dtf.format(now));
		
		Sheet sheet = wb.getSheetAt(0);
	    lastRow = sheet.getLastRowNum();
		Row row = sheet.createRow(++lastRow); 
		row.createCell(0).setCellValue(obj.getTestCase()+"");
		row.createCell(1).setCellValue(obj.getStartTime().toString());
		row.createCell(2).setCellValue(obj.getEndTime().toString());
		
		FileOutputStream fileOut = new FileOutputStream(FILE_NAME); 
	    wb.write(fileOut); 
	    fileOut.close();
	    */
		//TestSummary obj = new TestSummary();
		//obj.setEndTime(DateTime.now()+"");
		//obj.setStatus("Pass");

		//ExcelUtil.writeResult(1, 3, "Pass");

	}

}
