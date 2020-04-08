package com.la.stepDef;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.la.Utility.CreateFolder;
import com.la.Utility.PropertiesFileReader;
import com.la.Utility.Screenshotss;
import com.la.pageObjects.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogoutStepDef {

	public static WebDriver driver;
	PropertiesFileReader obj = new PropertiesFileReader();
	Properties prop = obj.redProperties();
	public String dir;

	@Given("^User enter correct url and logged in with valid credentials$")

	public void user_enter_correct_url_and_logged_in_with_valid_credentials() throws Throwable {

		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeDriver"));

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(prop.getProperty("browser.baseUrl"));

		dir = CreateFolder.CreateFolderAtEachRun("LogoutPage");

		Screenshotss.takeScreenshotatLogin(driver, dir, "1.png");

		new LoginPage(driver).loginFunction();

		Screenshotss.takeScreenshotatLogin(driver, dir, "2.png");

		new LoginPage(driver).clickLogin();

		Screenshotss.takeScreenshotatLogin(driver, dir, "3.png");

	}

	@Given("^user mouse hover on settings icon$")
	public void user_mouse_hover_on_settings_icon() throws Throwable {

		WebElement hover = driver.findElement(By.xpath(""));

		Actions action = new Actions(driver);
		action.moveToElement(hover).build().perform();
		Thread.sleep(2000);

		Screenshotss.takeScreenshotatLogin(driver, dir, "4.png");
	}

	@When("^user logout from the application$")
	public void user_logout_from_the_application() throws Throwable {

		WebElement logOutButton = driver.findElement(By.linkText(""));

		Actions actions = new Actions(driver);
		actions.moveToElement(logOutButton).click().perform();
		Thread.sleep(2000);

		Screenshotss.takeScreenshotatLogin(driver, dir, "5.png");
	}

	@Then("^successful messagae should be displayed on console$")

	public void successful_messagae_should_be_displayed_on_console() throws Throwable {

		System.out.println("User is logged out successfully");
		driver.close();

	}

}
