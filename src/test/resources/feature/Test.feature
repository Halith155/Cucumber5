@Regression
Feature: Testing DataTable
 @Test @Smoke
  Scenario: DataTable Testing
    Given Datatable with aslist
    |Selenium|
    |Java|
    |Cucumber|
    When Datatable with aslists
    |Selenium|java|  
    |Selenium|python| 

    And Datatable with asmap
    |username|dinesh|
		|password|Test@123|
		
    And Datatable with asmaps
			|username|password|
			|dinesh|Test@123|  
			|antony|Test@345|  
			
			Then Validate the outcome