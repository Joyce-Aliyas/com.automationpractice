package com.automationpractice.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(css = "a[class='login']")
	WebElement signInButton;

	public HomePage() {
		waitForDocumentCompleteState(15);
		PageFactory.initElements(driver, this);
	}

	public LoginPage ClickSignIn() {
		signInButton.click();
		return new LoginPage();
	}
}
