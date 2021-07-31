package com.app.tests;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.pages.BasePage;
import com.app.pages.PhpHomePageobjects;
import com.app.pages.PricingObject;

public class PricingTest {

	PhpHomePageobjects HomePage;
	BasePage bp;
	PricingObject pricing;

	public PricingTest() {
		HomePage = new PhpHomePageobjects();
		bp = new BasePage();
		pricing = new PricingObject();
	
		
	}
	
	@BeforeMethod
	public void clickPricing() {
		HomePage.getLinkPricing();
	}

	@Test
	public void verifyAndroidPriceFromPopup() {
		pricing.getAndroidPrice();
		int actual =pricing.getAndroidPrice();
		pricing.clickBuyNow();
		Assert.assertTrue(actual==pricing.getPriceFromPopup());
		pricing.closeDialog();
	}
	@Test
	public void verifyWebAppFeature() {
		HomePage.getLinkPricing();
		ArrayList<String> lst = pricing.getFeatureWebApp();
		Assert.assertTrue(lst.contains("Web Application"));
	}
	
}