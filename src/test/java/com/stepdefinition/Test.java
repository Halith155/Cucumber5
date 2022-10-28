package com.stepdefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {

	@Given("Datatable with aslist")
	public void datatable_with_aslist(DataTable table) {
		List<String> asList = table.asList();
		System.out.println(asList);
		System.out.println(asList.get(0));
	}

	@When("Datatable with aslists")
	public void datatable_with_aslists(DataTable table) {
			List<List<String>> asLists = table.asLists();
//			List<String> list = asLists.get(0);
			System.out.println(asLists.get(0).get(1));
			System.out.println(asLists.get(1).get(1));
			
	}

	@When("Datatable with asmap")
	public void datatable_with_asmap(DataTable table) {
		Map<String, String> asMap = table.asMap();
		System.out.println(asMap.get("username"));
		System.out.println(asMap.get("password"));
		
	}

	@When("Datatable with asmaps")
	public void datatable_with_asmaps(DataTable table) {
		List<Map<String, String>> asMaps = table.asMaps();
		System.out.println(asMaps.get(0));
		System.out.println(asMaps.get(0).get("username"));
		
	}
	
	@Then("Validate the outcome")
	public void validateTheOutcome() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}
