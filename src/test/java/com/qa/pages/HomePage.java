package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

WebDriver driver;
	
	//creating a constructor of homepage class
    public HomePage(WebDriver driver) { 
	
    	this.driver = driver; 
    	PageFactory.initElements(driver, this); 
    	 
    	} 
    	 
    	@FindBy(xpath="//button[@ng-click='manager()']") 
    	WebElement managerLoginBtn; 

    	  //click on add customer button 

       // driver.findElement(By.xpath("//button[@ng-class='btnClass1']")).click();
        
        
        //adding customer details
        //driver.findElement(By.xpath("//input[@ng-model='fName']")).sendKeys("Abc");
       // driver.findElement(By.xpath("//input[@ng-model='lName']")).sendKeys("Xyz");
        //driver.findElement(By.xpath("//input[@ng-model='postCd']")).sendKeys("10008");
        
        // clicking on add customer button
       // driver.findElement(By.xpath("//button[@type='submit']")).click();
        
      	//handling alart
      	//  driver.switchTo().alert().accept();
    	
    	
    	
    	@FindBy(xpath="//button[@ng-class='btnClass1']") 
    	WebElement addCustomer; 
    	 
    	@FindBy(xpath="//input[@ng-model='fName']") 
    	WebElement fName; 
    	 
    	@FindBy(xpath="//input[@ng-model='lName']") 
    	WebElement lName; 
    	 
    	@FindBy(xpath="//input[@ng-model='postCd']") 
    	WebElement zipCode; 
    	 
    	@FindBy(xpath="//button[@type='submit']") 
    	WebElement addBtn;

    	
	
	//login manager
	public void loginAsManager() {
		
		managerLoginBtn.click();
	}
	
	public void addCustomer(String fname, String lname, String zip) { 
		addCustomer.click(); 
		fName.sendKeys(fname); 
		lName.sendKeys(lname); 
		zipCode.sendKeys(zip); 
		addBtn.click(); 
		driver.switchTo().alert().accept(); 
		}

	
	
         }

	
	
	
		

