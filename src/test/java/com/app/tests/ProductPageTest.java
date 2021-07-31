package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.BasePage;
import com.app.pages.PhpHomePageobjects;
import com.app.pages.PricingObject;
import com.app.pages.ProductPageObject;

public class ProductPageTest {

	PhpHomePageobjects HomePage;
	BasePage bp;
	PricingObject pricing;
	ProductPageObject productinfo;

	public ProductPageTest() {
		HomePage = new PhpHomePageobjects();
		bp = new BasePage();
		pricing = new PricingObject();
		productinfo=new ProductPageObject();
	}

	@Test
	public void checkingCountOfWords() {
		productinfo.product();
		productinfo.product1();
		productinfo.countWords();
		Assert.assertTrue(productinfo.countWords() < 100);

	}

}
