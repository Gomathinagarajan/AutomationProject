package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhpHomePageobjects extends BasePage {

	@FindBy(linkText = "demo")
	private WebElement lnkDemo;

	@FindBy(linkText = "pricing")
	private WebElement lnkpricing;

	@FindBy(xpath = "//*[@id=\"Main\"]/div[6]/div/div[1]/section/div[2]/div[2]/div/div[1]")
	private WebElement txtAndroidAppPrice;

	public PhpHomePageobjects() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLinkDemo() {
		return lnkDemo;
	}

	public String getTxtLnkDemo() {
		return lnkDemo.getText();
	}

	public int getAndroidprice() {
		String price = txtAndroidAppPrice.getText();
		return Integer.parseInt(price);
	}

	public WebElement getLinkPricing() {
		return lnkpricing ;
	}
    public String getTxtLnkPricing() {
    	return lnkpricing.getText();
    
    }
	 
}