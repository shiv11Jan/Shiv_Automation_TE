package com.la.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.la.Utility.ExcelUtil;

import sun.security.krb5.internal.PAEncTSEnc;

public class LoginPage {
	
	WebDriver driver;
	
	 public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how =How.ID,using="")
	public WebElement company;
	
	@FindBy(how =How.ID,using="")
	public WebElement username;
	
	@FindBy(how =How.ID,using="")
	public WebElement password;
	
	@FindBy(how =How.ID,using="")
	public WebElement loginbutton;
	
	public void loginFunction() {
		
		String companyName = ExcelUtil.readData(1, 0);
		String userName = ExcelUtil.readData(1, 1);
		String passWord = ExcelUtil.readData(1, 2);
		
		company.sendKeys(companyName);
		username.sendKeys(userName);
		password.sendKeys(passWord);
		
		
	}
	
	public void clickLogin() {
		loginbutton.click();
		
	}

}
