package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageObject extends BasePage {

	@FindBy(xpath = "/html/body/header/div/nav/div[2]/span")
	private WebElement product;
	@FindBy(xpath = "/html/body/header/div/nav/div[2]/div/a[2]")
	private WebElement integration;
	@FindBy(xpath = "//*[@id=\"Main\"]/div[2]/div/p/text()")
	private WebElement integrationInfo;

	public ProductPageObject() {
		PageFactory.initElements(driver, this);
	}

	/*
	 * public WebElement product() { Actions action = new Actions(driver);
	 * action.moveToElement(product).perform(); return product();
	 * 
	 * }
	 * 
	 * public WebElement product1() { Actions action = new Actions(driver);
	 * action.moveToElement(integration).perform(); return product1(); }
	 */
	public String getintegrationTxt() {
		return integrationInfo.getText();
	}

	public void clickIntegrationdrop() {
		integrationInfo.click();
	}

	public int countWords() {
		String[] words = integrationInfo.getText().split(" ");
		int count = words.length;
		return count;
	}

}
