package com.app.pages;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class DressPageObject extends BasePage {

	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a")
	private WebElement letter_S;

	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
	private WebElement letter_M;

	@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
	private WebElement letter_L;

	@FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[2]")
	private WebElement ProductCountheader;
	@FindBys(@FindBy(xpath = "//*[@id=\'center_column\']/ul/li"))
	private List totalproductCounts;

	public int ProductCountheadert() {
		return Integer.parseInt(ProductCountheader.getText().split(" ")[2]);
	}

	public int ProductCount() {
    return(totalproductCounts.size());


}
