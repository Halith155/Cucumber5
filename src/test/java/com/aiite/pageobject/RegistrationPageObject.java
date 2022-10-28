package com.aiite.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageObject {

	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="re_password")
	private WebElement repassword;
	
	@FindBy(name="full_name")
	private WebElement fullName;
	
	@FindBy(name="email_add")
	private WebElement emailid;

	public RegistrationPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRepassword() {
		return repassword;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getEmailid() {
		return emailid;
	}
	
}
