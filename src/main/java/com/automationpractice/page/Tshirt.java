package com.automationpractice.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.base.TestBase;

public class Tshirt extends TestBase{
	@FindBy(css = "a[class='product_img_link']")
	WebElement fadedShortSleevTshirt;
	
	public Tshirt() {
		waitForDocumentCompleteState(15);
		PageFactory.initElements(driver, this);
	}
	
	public SelectSizeQuantity clickfadedShortSleevTshirt() {
		fadedShortSleevTshirt.click();
		return new SelectSizeQuantity();
	}

}
