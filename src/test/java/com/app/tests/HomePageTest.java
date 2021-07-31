package com.app.tests;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.BasePage;
import com.app.pages.HomePageObjects;

@Test
public class HomePageTest {
	
	HomePageObjects HomePage;
	BasePage bp;
	int value = new Random().nextInt(10000);
	public  HomePageTest() {
		HomePage = new HomePageObjects();
	bp=new BasePage();
	}
	@Test
	public void verifyTabNavigation() {
	HomePage.clickWomen();
	Assert.assertTrue(HomePage.getTitle().contains("Women"));
	HomePage.clickDresses();
	Assert.assertTrue(HomePage.getTitle().contains("Dresses"));
	HomePage.clickTshirts();
	Assert.assertTrue(HomePage.getTitle().contains("T-shirts"));
	
	}
	
	@Test
	public void verifydisplay() {
		Assert.assertTrue(HomePage.tabWomen());
		Assert.assertTrue(HomePage.tabDresses());
		Assert.assertTrue(HomePage.tabTshirt());
	}
	
	
	@Test
	public void verifyEmail() {
		String email = "Trainauto" + value  + "@gmail.com";
		HomePage.setEmail(email);
		HomePage.clickmail();
		Assert.assertTrue(HomePage.getSuccessfulRegistrationText().contains("successfully"));
	}
}