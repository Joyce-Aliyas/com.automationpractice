package com.automationpractice.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.base.TestBase;

public class MyAccount extends TestBase {
	@FindBy(css = "div#block_top_menu ul li:nth-child(3) a[title='T-shirts']")
	WebElement tshirtbutton;

	public MyAccount() {
		waitForDocumentCompleteState(15);
		PageFactory.initElements(driver, this);
	}

	public Tshirt clickTshirtLink() {
		tshirtbutton.click();
		return new Tshirt();

	}

}
