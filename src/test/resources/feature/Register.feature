@Regression
Feature: Testing Addactine Registeration Page
  I want to use this template for my feature file
  
  Background:
		Given Load the Addactine Webpage using "chrome"
    And Click on New User Registration Link
  
@Smoke
  Scenario: Validating Registration Page using valid input
    
    When Input the Username as "dinesh"
    And input the password as "Test@123"
    And input the confirm password as "Test@123"
    And input the fullname as "Dinesh kumar"
    And input the email Id "dinesh@gmail.com"
    Then Validate the user got generated
@Sanity
  Scenario Outline: Validation Registration Page using Scenario Outline

    When Input the Username as "<username>"
    And input the password as "<password>"
    And input the confirm password as "<confirm password>"
    And input the fullname as "<full name>"
    And input the email Id "<email id>"
    Then Validate the user got generated

    Examples: 
      | username | password | confirm password | full name     | email id         |
      | dinesh   | Test@123 | Test@123         | Dinesh Kumar  | dinesh@gmail.com |
      | Antony   | Test@345 | Test@345         | Antony Ronald | antony@gmail.com |
