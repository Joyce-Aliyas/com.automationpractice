package com.automationpractice.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(css = "input#email")
	WebElement emailInputBox;

	@FindBy(css = "input#passwd")
	WebElement passwordInputBox;
	
	@FindBy(css="button#SubmitLogin")
	WebElement submitButtom;
	
	public LoginPage() {
		waitForDocumentCompleteState(15);
		PageFactory.initElements(driver, this);
	}

	public void enterEmail() {
		emailInputBox.sendKeys(prop.getProperty("username"));
	}
	public void enterPassword() {
		passwordInputBox.sendKeys(prop.getProperty("password"));
	}
	public MyAccount clickSubmitButton() {
		submitButtom.click();
		return new MyAccount();
		
	}

	public MyAccount loginToMyAccount() {
		enterEmail();
		enterPassword();
		return clickSubmitButton();
	}
}
