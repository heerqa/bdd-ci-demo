package com.demo.page;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://app.iqabinet.com/login.html")
public class LoginPage extends PageObject {

	@FindBy(id="email")
	WebElement loginEmail;
	
	@FindBy(id="password")
	WebElement loginPassword;
	
	@FindBy(id="button-login")
	WebElement loginBtn;
	
	public void setLoginEmail(String stremail){
		waitFor(loginEmail);
		loginEmail.clear();
		loginEmail.sendKeys(stremail);
	}
	
	public void setLoginPassword(String strpassword){
		waitFor(loginPassword);
		loginPassword.clear();
		loginPassword.sendKeys(strpassword);
		
	}

	public void clickLogin(){
		loginBtn.click();
	}

}

