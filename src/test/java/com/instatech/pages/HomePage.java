/**
 * 
 */
package com.instatech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.servlet.jmx.HolderMBean;
import org.testng.Assert;

/**
 * @author irfan
 *
 */


public class HomePage{
	WebDriver driver;

	//Constructor
	public HomePage(WebDriver driver){
		this.driver=driver;
		//PageFactory.initElements(driver, HomePage.class);
	}
	
	//Using FindBy for locating elements
	//@FindBy(linkText = "Sign in") WebElement signInLink;	
	@FindBy(xpath = "//input[@placeholder='email address']") WebElement emailField;	
	@FindBy(xpath = "//input[@placeholder='password']") WebElement passwordField;
	@FindBy(xpath = "//button[@id='btnlogin']") WebElement loginButton;
	
	
	//h2[contains(text(),'Login to your account')]
	
	public void verifyHomePageTitle(){
		System.out.println("Title is  " + driver.getTitle());
		//Assert.assertEquals(actual, expected);
	}
	
}