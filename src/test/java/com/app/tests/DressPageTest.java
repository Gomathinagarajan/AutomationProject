package com.app.tests;

import com.app.pages.BasePage;
import com.app.pages.DressPageObject;
import com.app.pages.HomePageObjects;

public class DressPageTest {

	DressPageObject HomePage1;
	BasePage bp;
	public  DressPageTest() {
		HomePage1 = new DressPageObject();
	bp=new BasePage();
	}
	
	public void verifyproductcout() {
		HomePage.clickDresses();
		Assert.assertEquals(HomePage1.ProductCount(), HomePage1.ProductCountheadert());
		

}
