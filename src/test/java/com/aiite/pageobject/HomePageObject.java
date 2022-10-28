package com.aiite.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject {
	@FindBy(linkText="New User Register Here")
	private WebElement newRegister;	
	
	
	public WebElement getNewRegister() {
		return newRegister;
	}

	public HomePageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
