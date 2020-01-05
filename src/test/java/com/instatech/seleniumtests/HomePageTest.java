/**
 * 
 */
package com.instatech.seleniumtests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.instatech.pages.HomePage;

/**
 * @author irfan
 *
 */
public class HomePageTest extends BaseTest{
	
	@Test
	public void openSignInPage() throws InterruptedException{
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		//homePage.clickSignInLink();
		homePage.verifyHomePageTitle();
		Thread.sleep(5000);
	}

}
