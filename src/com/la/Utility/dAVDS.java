package com.la.Utility;

import org.joda.time.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class dAVDS {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TLP 62\\Documents\\Shiv\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://scrum-re.leaseaccelerator.com/lease_accelerator/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("appid")).sendKeys("Acme");
		driver.findElement(By.id("username")).sendKeys("test_user_s");
		driver.findElement(By.id("clearPwd")).sendKeys("Lessa@123");
		driver.findElement(By.id("loginout")).click();
		
		WebElement hover =  driver.findElement(By.xpath("//div[@class ='pageMainContent']//a[@class='settings']"));

		Actions action = new Actions(driver);
		action.moveToElement(hover).build().perform();
		Thread.sleep(2000);
		
		WebElement logOutButton = driver.findElement(By.linkText("LOG OUT"));

		Actions actions = new Actions(driver);
		actions.moveToElement(logOutButton).click().perform();
		Thread.sleep(2000);
		
		System.out.println(DateTime.now());
		
	
	}
}
