package com.app.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;


public class PricingObject extends BasePage {

	@FindBy(xpath ="//*[@id=\"Main\"]/div[6]/div/div[1]/section/div[2]/div[2]/div/div[4]/span[1]")
	private WebElement txtPriceAndroidApp;
	
	@FindBy(xpath = "//div[@class= 'cards']/div[2]//span[contains(text(),'Buy now')]")
	private WebElement btnBuyNowAndroid;
	
	@FindBy(xpath ="//div[@id='android']//strong")
	private WebElement txtPriceAndroidFromDialog;
	
	@FindBy(xpath = "//div[@id='android']//button[@class='close']")
	private WebElement iconCloseDialog;
	
	@FindBys(@FindBy(xpath ="//div[@class='bottom wow fadeIn animated']/div[1]//div[.//*[@fill='#2E4CE6']]/span[2]"))
    private List<WebElement> lstWebAppAvailable;
	
	public PricingObject() {
		PageFactory.initElements(driver, this);
	}
	public int getAndroidPrice() {
		String price = txtPriceAndroidApp.getText();
		return Integer.parseInt(price);
	}
	public void clickBuyNow() {
		btnBuyNowAndroid.click();
	}
	public int getPriceFromPopup() {
		String price = txtPriceAndroidFromDialog.getText().replace("$", "");
		return Integer.parseInt(price);
	}
	public void closeDialog() {
		iconCloseDialog.click();
	}
		
		public ArrayList<String> getFeatureWebApp(){
			ArrayList<String> lst = new ArrayList<String>();
			for (WebElement element:lstWebAppAvailable) {
				element.getText();
			}
			return lst;
			}
				
	
			
		
		
	}
	  