package com.bdd.cucumber.step.serenity;



import net.thucydides.core.annotations.Step;

import org.junit.Assert;

import com.demo.page.HomePage;
import com.demo.page.LoginPage;

public class LoginStep {
	
	
LoginPage loginPage;
HomePage homePage;

@Step
public void user_is_on_login_page() throws Throwable {
	loginPage.open();
    
}

@Step
public void user_enters_valid_username_and_passsword_and_click_login() throws Throwable {
	loginPage.setLoginEmail("heer.qa@gmail.com");
    loginPage.setLoginPassword("At12345678");
    loginPage.clickLogin();
}

@Step
public void user_is_loggedin() throws Throwable {
	Assert.assertEquals("Pleasssadsde give us a moment to make your data securely available to you.", homePage.getPopUpText());
	//Assert.assertEquals("Personal Documents", homePage.getPersonalDcumentText());
}



}
