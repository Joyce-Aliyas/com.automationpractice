package com.automationpractice.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.base.TestBase;

public class SelectSizeQuantity extends TestBase {
	@FindBy(css = "input[name='qty'][id='quantity_wanted']")
	WebElement inputQuantity;
	// p[id='quantity_wanted_p'] input[id='quantity_wanted']
	@FindBy(css = "select[name='group_1']")
	WebElement inputSize;

	@FindBy(css = "div[class='attribute_list'] ul li:nth-child(2)")
	WebElement selectColor;

	@FindBy(css = "p[id='add_to_cart'] button[type='submit']")
	WebElement addToCartButton;

	public SelectSizeQuantity() {
		waitForDocumentCompleteState(15);
		PageFactory.initElements(driver, this);
	}

	public void clickInputQuantity() {
		Actions action =new Actions(driver);
		action.moveToElement(inputQuantity).build().perform();
		
		inputQuantity.sendKeys("2");
	}

	public void selectSize() {
		inputSize.sendKeys("M");
	}

	public void selectColour() {
		selectColor.click();
	}

	public ProceedToCheckOutPage clickAddToCartButton() {
		addToCartButton.click();
		return new ProceedToCheckOutPage();
	}

	public ProceedToCheckOutPage configureAddToCartButton() {
		clickInputQuantity();
		selectSize();
		selectColour();
		return clickAddToCartButton();
	}
}
