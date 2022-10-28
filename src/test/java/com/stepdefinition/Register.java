package com.stepdefinition;

import com.aiite.base.BaseClass;
import com.aiite.pageobject.HomePageObject;
import com.aiite.pageobject.RegistrationPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register extends BaseClass{

HomePageObject home=null;
RegistrationPageObject register=null;

	@Given("Load the Addactine Webpage using {string}")
	public void load_the_addactine_webpage_using(String string) {
	  setDriver(string);
	  getUrl("https://adactinhotelapp.com/");
		
	}

	@Given("Click on New User Registration Link")
	public void click_on_new_user_registration_link() {
		home = new HomePageObject(getDriver());
		clickButtons(home.getNewRegister());
	}

	@When("Input the Username as {string}")
	public void input_the_username_as(String string) {
		register = new RegistrationPageObject(getDriver());
		inputboxText(register.getUsername(), string);
	}

	@When("input the password as {string}")
	public void input_the_password_as(String string) {
		inputboxText(register.getPassword(), string);
	}

	@When("input the confirm password as {string}")
	public void input_the_confirm_password_as(String string) {
		inputboxText(register.getRepassword(), string);
	}

	@When("input the fullname as {string}")
	public void input_the_fullname_as(String string) {
		inputboxText(register.getFullName(), string);
	}

	@When("input the email Id {string}")
	public void input_the_email_id(String string) {
		inputboxText(register.getEmailid(), string);
	}

	@Then("Validate the user got generated")
	public void validate_the_user_got_generated() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
}
