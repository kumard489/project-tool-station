package org.projecttoolstation;

import static org.testng.Assert.expectThrows;

import java.util.Date;
import java.util.concurrent.locks.Condition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.HomepagePojo;
import org.utilities.SignInPagePojo;

public class TestingSingInSinario extends BaseClass {

	@BeforeClass(alwaysRun = true)
	public void startingBrowser() {
		/*
		 * launchChrome(); chromeObject(); winMax();
		 */
		System.out.println("TestingSingInSinario started");
	}

	/**/@Parameters({ "signInPage" })
	@BeforeMethod(groups = "smoke")
	public void startTime(/**/@Optional("https://www.toolstation.com/login")String url) {
		implicitWaiting();
		launchUrl(url);
		Date d = new Date();
		System.out.println(d);
	}

	/*
	  @Test(groups="smoke") public void popupFunctionalityTest2() { HomepagePojo hp
	  = new HomepagePojo(); WebElement acceptAll = hp.getAcceptAll();
	  Assert.assertTrue(acceptAll.getText().equalsIgnoreCase("Allow all"));
	  acceptAll.click(); }
	 */

	// invalid user name and invalid user name
	@Test(groups = "smoke")
	public void testCase1() {
		SignInPagePojo si = new SignInPagePojo();
		si.getTxtUserName().sendKeys(getData(1, 3, 0));
		si.getTxtPassword().sendKeys(getData(1, 3, 1));
		si.getBtnLogin().click();
		String text = si.getIncorrectLoginDetailsMessage().getText();
		Assert.assertTrue(text.contains("Incorrect"));
		scrnshot("incorrect");
	}

	// long username and invalid password
	@Test(groups = "smoke")
	public void testCase2() {
		SignInPagePojo si = new SignInPagePojo();
		si.getTxtUserName().sendKeys(getData(1, 6, 0));
		si.getTxtPassword().sendKeys(getData(1, 6, 1));
		si.getBtnLogin().click();
		String text = si.getUsernameValidEmailMessage().getText();
		Assert.assertTrue(text.contains("valid email"));
		scrnshot("long_username");
	}

	// empty username and invalid password
	@Test(groups = "smoke")
	public void testCase3() {
		SignInPagePojo si = new SignInPagePojo();
		si.getTxtPassword().sendKeys(getData(1, 4, 1));
		si.getBtnLogin().click();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("login"));
		scrnshot("empty_username");
	}

	// leaving both username and password as empty
	@Test(groups = "smoke")
	public void testCase4() {
		SignInPagePojo si = new SignInPagePojo();
		si.getBtnLogin().click();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("login"));
		scrnshot("both_empty");
	}

	@AfterMethod(groups = "smoke")
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterClass(alwaysRun = true)
	public void quitBrowser() {
		/* closeBrowser(); */
		System.out.println("TestingSingInSinario ended");
	}

}
