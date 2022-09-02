package org.projecttoolstation;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.HomepagePojo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class homePageTesting extends BaseClass {

	@BeforeClass(alwaysRun = true)
	public void startingBrowser() {
		launchChrome();
		chromeObject();
		winMax();
		System.out.println("homePageTesting started");
	}

	@Parameters({ "homePage" })
	@BeforeMethod(groups = "retest")
	public void startTime(String url) {
		implicitWaiting();
		launchUrl(url);
		Date d = new Date();
		System.out.println(d);
	}

	// accepting cookies
	@Test(groups = "retest")
	public void popupFunctionalityTest1() {
		HomepagePojo hp = new HomepagePojo();
		WebElement acceptAll = hp.getAcceptAll();
		Assert.assertTrue(acceptAll.getText().equalsIgnoreCase("Allow all"));
		acceptAll.click();
	}

	// checking set branch UI
	@Test(groups = "smoke")
	public void testcase1() {
		HomepagePojo hp = new HomepagePojo();
		implicitWaiting();
		hp.getSetBranch().click();
		Assert.assertTrue(hp.getSetBranchMessage().getText().contains("branch"));
		scrnshot("set_branch_page");
	}

	// checking signin UI
	@Test(groups = "smoke")
	public void testCase2() {
		HomepagePojo hp = new HomepagePojo();
		implicitWaiting();
		hp.getSignIn().click();
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("login"));
		scrnshot("sign_in_page");
	}

	// checking register UI
	@Test(groups = "smoke")
	public void testcase3() {
		HomepagePojo hp = new HomepagePojo();
		implicitWaiting();
		hp.getRegister().click();
		Assert.assertTrue(driver.getCurrentUrl().contains("register"));
        scrnshot("register_page");
	}

	// checking cart UI
	@Test(groups = "smoke")
	public void testcase4() {
		HomepagePojo hp = new HomepagePojo();
		implicitWaiting();
		hp.getTrolley().click();
		Assert.assertTrue(driver.getCurrentUrl().contains("trolley"));
        scrnshot("Trolley_page");
	}

	@AfterMethod(groups = "retest")
	public void endTime() {
		Date d = new Date();
		System.out.println(d);

	}

	@AfterClass(alwaysRun = true)
	public void quitBrowser() {
		/* closeBrowser(); */
	}

}
