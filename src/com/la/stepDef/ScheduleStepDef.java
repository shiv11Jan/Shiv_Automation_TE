package com.la.stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScheduleStepDef extends BaseTest {

	

	@Given("^User is on HomePage$")
	public void user_is_on_HomePage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		BaseTest.setUp();

	}

	@When("^user click on the Enter Schedule$")
	public void user_click_on_the_Enter_Schedule() throws Throwable {

		driver.findElement(By.linkText("Enter Schedule")).click();
		
		//driver.findElement(By.xpath("//ul[@id='leasingProcessNavBar']//li[3]/a")).click();
	}

	@When("^select Lessee name$")
	public void select_Lessee_name() throws Throwable {

		driver.findElement(By.id("LesseePartyEntry")).sendKeys("ACME");

	}

	@When("^select value in the ship to$")
	public void select_value_in_the_ship_to() throws Throwable {

		driver.findElement(By.id("ShipToPartyEntry")).sendKeys("Sydney [2 Wheatwallis Rd]");

	}

	@When("^select Funder name$")
	public void select_Funder_name() throws Throwable {

		driver.findElement(By.id("FunderPartyEntry")).sendKeys("ABC Pvt Ltd");

	}

	@When("^select Geographic Area$")
	public void select_Geographic_Area() throws Throwable {

		driver.findElement(By.id("GeoPartyEntry")).sendKeys("US");

	}

	@When("^select BU$")
	public void select_BU() throws Throwable {

		driver.findElement(By.id("SBUPartyEntry")).sendKeys("Acme Asia");

	}

	@When("^click on th Details$")
	public void click_on_th_Details() throws Throwable {

		driver.findElement(By.xpath("//div[@id='mainContent']//ul[@class='yui-nav']//li[2]")).click();

	}

	@When("^enter Lease Schedule number$")
	public void enter_Lease_Schedule_number() throws Throwable {

		driver.findElement(By.id("number")).sendKeys("999999");

	}

	@When("^select Document Date$")
	public void select_Document_Date() throws Throwable {

		WebElement month = driver.findElement(By.id("calendarWidget2_Month"));
		Select oselect_month = new Select(month);

		oselect_month.selectByValue("10");

		WebElement day = driver.findElement(By.id("calendarWidget2_Day_ID"));
		Select oselect_day = new Select(day);

		oselect_day.deselectByVisibleText("25");

		driver.findElement(By.id("calendarWidget2_Year_ID")).sendKeys("2019");

	}

	@When("^select Currency$")
	public void select_Currency() throws Throwable {

		WebElement currency = driver.findElement(By.id("currency"));

		Select oselect_currency = new Select(currency);

		oselect_currency.selectByValue("USD");

	}

	@When("^click on Plus icon$")
	public void click_on_Plus_icon() throws Throwable {

		driver.findElement(By.id("genericAddLineItem")).click();

	}

	@When("^select product catagory$")
	public void select_product_catagory() throws Throwable {

		WebElement prod_catagory = driver.findElement(By.id("productCategory"));

		Select oselect_prod_catagory = new Select(prod_catagory);

		oselect_prod_catagory.selectByVisibleText("Buses");
	}

	@When("^select cost center$")
	public void select_cost_center() throws Throwable {

		WebElement cost_center = driver.findElement(By.id("costCenter"));

		Select oselect_cost_center = new Select(cost_center);

		oselect_cost_center.selectByVisibleText("TBD (TBD)");

	}

	@When("^select GL code$")
	public void select_GL_code() throws Throwable {

		WebElement gl_code = driver.findElement(By.id("glCode"));

		Select oselect_gl_code = new Select(gl_code);

		oselect_gl_code.selectByVisibleText("TBD");

	}

	@When("^Enter Quantity$")
	public void enter_Quantity() throws Throwable {

		driver.findElement(By.id("quantity")).sendKeys("500");

	}

	@When("^Enter Unit Price$")
	public void enter_Unit_Price() throws Throwable {

		driver.findElement(By.id("unitPrice")).sendKeys("50");

	}

	@When("^click on the Add button$")
	public void click_on_the_Add_button() throws Throwable {

		driver.findElement(By.id("addLineItemButton"));
	}

	@When("^clicks on the Terms$")
	public void clicks_on_the_Terms() throws Throwable {

		driver.findElement(By.id("tabTerms")).click();

	}

	@When("^Enter Blended LRF value$")
	public void enter_Blended_LRF_value() throws Throwable {

		driver.findElement(By.id("volatileFieldC")).sendKeys("0.12345");

	}

	@When("^click on details$")
	public void click_on_details() throws Throwable {

		driver.findElement(By.xpath("//div[@id='mainContent']//ul[@class='yui-nav']//li[2]")).click();

	}

	@When("^click on the save button$")
	public void click_on_the_save_button() throws Throwable {

		driver.findElement(By.className("eventbutton")).click();
	}

	@Then("^user shoud be navigated to the Deal History page with the$")
	public void user_shoud_be_navigated_to_the_Deal_History_page_with_the() throws Throwable {

	}

}
