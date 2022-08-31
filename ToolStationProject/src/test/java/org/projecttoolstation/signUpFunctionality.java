package org.projecttoolstation;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.CreateMyAccountPojo;
import org.utilities.HomepagePojo;

public class signUpFunctionality extends BaseClass {

	@BeforeClass(alwaysRun = true)
	public void startingBrowser() {
		/*
		 * launchChrome(); chromeObject(); winMax();
		 */
		System.out.println("signUpFunctionality started");
	}

	@BeforeMethod(groups = "smoke")
	public void startTime() {
		launchUrl("https://www.toolstation.com/register");
		Date d = new Date();
		System.out.println(d);
	}
	/*
	 * @Test(groups="smoke") public void popupFunctionalityTest4() { HomepagePojo
	 * hp=new HomepagePojo(); WebElement acceptAll = hp.getAcceptAll();
	 * Assert.assertTrue(acceptAll.getText().equalsIgnoreCase("Allow all"));
	 * acceptAll.click(); }
	 */
    
	// filling mandatory text box and giving short password
	@Test(groups = "smoke")
	public void testCase1() {
		implicitWaiting();
		CreateMyAccountPojo cma = new CreateMyAccountPojo();

		WebElement selectTitle = cma.getSelectTitle();
		selectingDropdownText(selectTitle, "Mr");

		cma.getTxtFirstName().sendKeys(getData(2, 1, 2));
		cma.getTxtLastName().sendKeys(getData(2, 1, 3));
		cma.getTxtMobile().sendKeys(getData(2, 1, 5));
		cma.getTxtEmail().sendKeys(getData(2, 1, 7));
		cma.getCbEmail().click();
		cma.getTxtEnterAddressManually().click();
		cma.getTxtHouseNameOrNum().sendKeys(getData(2, 1, 10));
		cma.getTxtTown().sendKeys(getData(2, 1, 11));
		cma.getTxtPostcode().sendKeys(getData(2, 1, 8));
		cma.getTxtFirstpassword().sendKeys(getData(2, 1, 9));
		cma.getCbAcceptPolicies().click();
		cma.getBtnContinue().click();
		Assert.assertTrue(cma.getShortPasswordMessage().getText().contains("too short"));
	}

	@AfterMethod(groups = "smoke")
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterClass(alwaysRun = true)
	public void quitBrowser() {
		/* closeBrowser(); */
		TestingSingInSinario tsi = new TestingSingInSinario();
	}

}
