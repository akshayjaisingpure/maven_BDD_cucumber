package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions
	(
	features="src/main/java/com/features",     // login. feature file properties path
	glue="com.stepdefs",
	dryRun =false,  // it is used to compile feature file
	monochrome = true,  //  to readable output
	plugin = "html:target"
//	tags="@login"   // tags are used to specific scenario  //  scenario means single test case and feature means group of test case
	)
	
public class TestRunner{
		
	}



