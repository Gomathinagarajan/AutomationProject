package com.app.tests;

import org.testng.annotations.Test;

import com.app.pages.AmazonObject;
import com.app.pages.BasePage;

public class AmazonTest {

	BasePage bp;
	AmazonObject AmazonHomepage;	
	public int b = 78;
	
	public AmazonTest() {
		bp = new BasePage();
		AmazonHomepage = new AmazonObject();
		
	}
	@Test
	public void  verifyDropDown () {
		AmazonHomepage.selectDropDownSortBy("index(2)");
		AmazonHomepage.getProductPrices();
		for(int i=0;i<20;i++) {
			
		}
		
	}
}
