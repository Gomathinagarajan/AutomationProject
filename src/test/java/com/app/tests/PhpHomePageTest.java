package com.app.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.BasePage;
import com.app.pages.PhpHomePageobjects;



public class PhpHomePageTest {
	PhpHomePageobjects homePage;
	BasePage bp;
	

	public PhpHomePageTest() {
		homePage = new PhpHomePageobjects();
	          bp =new BasePage();
	}
     @Test
	public void verifyDemolink() {
    	 WebElement element = homePage.getLinkDemo();
       Assert.assertTrue(bp.elementFound(element));
       Assert.assertTrue(homePage.getTxtLnkDemo().equals("Demo"));
       
     } 
     @Test
     public void verifyPricinglink() {
    	 WebElement element = homePage.getLinkDemo();
       Assert.assertTrue(bp.elementFound(element));
       Assert.assertTrue(homePage.getTxtLnkDemo().equals("Pricing"));
       
     } 
       @Test
       public void verifyAndroidPrice() {
    	   Assert.assertTrue(homePage.getAndroidprice() < 1000);
       }
	
	}
