package com.demo.page;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject {
	@FindBy(id="dialog-body-text")
	WebElement loginpop;
	
	@FindBy(linkText="Personal Documents")
	WebElement personaldocument;
	
	public String getPopUpText(){
		waitFor(loginpop);
		return loginpop.getText();
	}
	
	public String getPersonalDcumentText(){
		waitFor(personaldocument);
		return personaldocument.getText();
	}
	
	

}
