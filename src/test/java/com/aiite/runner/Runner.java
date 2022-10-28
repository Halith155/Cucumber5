package com.aiite.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:Report/CucumberReport.html"}, features = { "./src/test/resources/feature/" }, glue = {
		"com.stepdefinition" }, monochrome = true, dryRun = false, 
				snippets = SnippetType.CAMELCASE, publish = true,tags="@Regression and @Sanity")
public class Runner {

}
