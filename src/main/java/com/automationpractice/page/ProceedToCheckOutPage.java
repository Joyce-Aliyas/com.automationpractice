package com.automationpractice.page;

import org.openqa.selenium.support.PageFactory;

import com.automationpractice.base.TestBase;

public class ProceedToCheckOutPage extends TestBase {

	public ProceedToCheckOutPage() {
		waitForDocumentCompleteState(15);
		PageFactory.initElements(driver, this);
	}

}
