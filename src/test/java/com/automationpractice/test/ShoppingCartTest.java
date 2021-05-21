package com.automationpractice.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.base.TestBase;
import com.automationpractice.page.HomePage;
import com.automationpractice.page.LoginPage;
import com.automationpractice.page.MyAccount;
import com.automationpractice.page.ProceedToCheckOutPage;
import com.automationpractice.page.SelectSizeQuantity;
import com.automationpractice.page.Tshirt;

public class ShoppingCartTest extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	MyAccount myAccount;
	Tshirt tshirt;
	SelectSizeQuantity selectSizeQuantity;
	ProceedToCheckOutPage proceedToCheckOutPage;
	
	@BeforeMethod
	public void beforeMethod() {
		initialisation();
		// driver.navigate().refresh();
		homePage = new HomePage();
		loginPage = homePage.ClickSignIn();
		myAccount = loginPage.loginToMyAccount();
		tshirt = myAccount.clickTshirtLink();
		selectSizeQuantity = tshirt.clickfadedShortSleevTshirt();
		//proceedToCheckOutPage= selectSizeQuantity.configureAddToCartButton();
		driver.manage().window().maximize();
	}

	@Test
	public void test() {
		//tshirt.clickfadedShortSleevTshirt();
		selectSizeQuantity.configureAddToCartButton();
	}

	@AfterMethod
	public void afterMethod() {
		// driver.quit();
	}
}
