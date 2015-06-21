package com.bdd.cucumber.step;

import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/com/bdd/cucumber/feature" ,plugin={"html:target/html", "json:target/cucumber.json"})
public class AcceptanceTestSuite {

}
