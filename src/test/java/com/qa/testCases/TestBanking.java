package com.qa.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.BaseClass;
import com.qa.pages.HomePage;
import com.qa.utilities.BrowserFactory;

public class TestBanking extends BaseClass{

	 //WebDriver driver;

	 @Test (priority=1)
	public void openBankSite() { 
		logger =  report.createTest("Client creation test");
		 
		 
		 
		
	 //driver=BrowserFactory.openApplication(driver,"chrome","https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login"); 
	
	 //creating an object of Homepage class
	 HomePage home=new HomePage(driver);
	 home.loginAsManager();
	 logger.info("Logged in as Manager");

	 home.addCustomer(excel.getStringData("Client", 1, 0), 
	excel.getStringData("Client", 1, 1), excel.getStringData("Client", 1, 2));
	 logger.info("Added a client");

	 
	 
	 
	 
	 
	// @Test  (priority=2)
		//public void logout() { 
			//logger =  report.createTest("logout  test");
			 
		// logger.info("Attempting to logout");
		// logger.fail("Failed to logout");
		 
		 
	// Assert.fail();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
//	System.out.println(driver.getTitle());

	}
	 
	 // it goes to base class
	 
	 //@BeforeClass
	// public void setUp() { 
		 //driver = BrowserFactory.openApplication(driver, "chrome", "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/loginhttps://www.globalsqa.com/angularJs-protractor/BankingProject/#/login"); 
	 //} 
	 //@AfterClass 
	 //public void tearDown() throws InterruptedException { 
	 //Thread.sleep(1000); 
	 //driver.close(); 
	// }

	 
	 
	}
	

		
		

	
	

