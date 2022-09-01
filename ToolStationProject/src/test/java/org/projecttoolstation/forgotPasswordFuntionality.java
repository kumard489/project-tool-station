package org.projecttoolstation;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.ForgottenPasswordPojo;
import org.utilities.HomepagePojo;

public class forgotPasswordFuntionality extends BaseClass {

	@BeforeClass(alwaysRun = true)
	public void startingBowser() {
		/*
		 * launchChrome(); chromeObject(); winMax();
		 */
		System.out.println("forgotPasswordFuntionality started");
	}

	@BeforeMethod(groups = "smoke")
	public void starTime() {
		launchUrl(getData(3, 5, 1));
		Date d = new Date();
		System.out.println(d);
	}

	/*
	 * @Test(groups="smoke") public void popupFunctionalityTest4() { HomepagePojo
	 * hp=new HomepagePojo(); WebElement acceptAll = hp.getAcceptAll();
	 * Assert.assertTrue(acceptAll.getText().equalsIgnoreCase("Allow all"));
	 * acceptAll.click(); }
	 */

	// giving invalid mail id
	@Test(groups = "smoke")
	public void testCase1() {
		ForgottenPasswordPojo fpf = new ForgottenPasswordPojo();
		fpf.getTxtFPUsername().sendKeys(getData(1, 6, 0));
		fpf.getBtnReset().click();
		Assert.assertTrue(fpf.getInvalidMailIdMessage().getText().contains("valid email"));
	}

	@AfterMethod(groups = "smoke")
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterClass(alwaysRun = true)
	public void quitBrowser() {
		/* closeBrowser(); */
	}

}
