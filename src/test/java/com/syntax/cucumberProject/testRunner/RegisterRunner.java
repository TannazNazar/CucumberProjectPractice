package com.syntax.cucumberProject.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/tannaznazar/eclipse-workspace/cucumberProjectPractice/src/test/resources/Features/Registeration.feature"
	,glue="")
public class RegisterRunner {

}
