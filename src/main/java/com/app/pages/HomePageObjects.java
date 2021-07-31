package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {
	
	
	@FindBy(xpath = "//*[@id=\'block_top_menu\']/ul/li[1]/a")
	private WebElement tabWomen;
	
	@FindBy(xpath = "//*[@id=\'block_top_menu\']/ul/li[2]/a")
	private WebElement tabDresses;
	
	@FindBy(xpath = "//*[@id=\'block_top_menu\']/ul/li[3]/a")
	private WebElement tabTshirt;
	
	@FindBy(id = "newsletter-input")
	private WebElement txtBoxEmail;
	
	@FindBy(xpath ="//*[@id=\"newsletter_block_left\"]/div/form/div/button")
	private WebElement clickmail;
	
	@FindBy(xpath = "//*[@id=\"columns\"]/p")
	private WebElement successfulyregistered;
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
      public void clickWomen() {
    	  tabWomen.click();
    	  }
      public void clickDresses() {
    	  tabDresses.click();
    	  }
      public void clickTshirts() {
    	  tabTshirt.click();
    	  }
      
      public boolean tabWomen() {
    	  return elementFound(tabWomen);
    	  
      }
      public boolean tabTshirt() {
    	  return elementFound(tabTshirt);
      }
      public boolean tabDresses() {
    	  return elementFound(tabDresses);
      }
	  public void setEmail(String email) {
         setText (txtBoxEmail , email);
	
	  }
	  public String getSuccessfulRegistrationText() {
		  return successfulyregistered.getText();
	  }
	public void clickmail() {
		clickmail.click();		
	}
	public WebElement getLinkDemo() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getAndroidPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Object getTxtLnkDemo() {
		// TODO Auto-generated method stub
		return null;
	}
	 
	}
      