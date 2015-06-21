package com.bdd.cucumber.step;

import net.thucydides.core.annotations.Steps;

import com.bdd.cucumber.step.serenity.LoginStep;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {

	@Steps
	LoginStep loginStep;

	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		loginStep.user_is_on_login_page();
	}

	@When("^user enters valid username and passsword and click login$")
	public void user_enters_valid_username_and_passsword_and_click_login()
			throws Throwable {
		loginStep.user_enters_valid_username_and_passsword_and_click_login();
	}

	@Then("^user is loggedin$")
	public void user_is_loggedin() throws Throwable {
		Thread.sleep(15000);
		loginStep.user_is_loggedin();
	}

}
