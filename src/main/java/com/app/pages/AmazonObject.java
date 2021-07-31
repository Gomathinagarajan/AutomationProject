package com.app.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AmazonObject extends BasePage {

	
	@FindBy(name="sortBy")
	private WebElement ddnSortBy;
	
	@FindBys(@FindBy(className="a-price-whole"))
	private List<WebElement> lstProductPrices;
	
	
	public AmazonObject() {
		PageFactory.initElements(driver, this);
	}
		
		public void selectDropDownSortBy(String sortOptions) {
			selectFromDropDown(ddnSortBy,sortOptions);
		}
		public ArrayList<Double> getProductPrices() {
			
			ArrayList<Double> lst = new ArrayList<Double>();
			for (WebElement element : lstProductPrices) {
				lst.add(Double.parseDouble(element.getText().replace(",", "").trim()));
			}
			return lst;
			
			}
		}
	