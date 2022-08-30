package org.projecttoolstation;

import java.time.Duration;
import java.util.Date;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;
import org.utilities.BaseClass;
import org.utilities.HomepagePojo;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class SearchBoxFunctionality extends BaseClass{
	
	
	@BeforeClass(alwaysRun=true)
	public void startingBrowser() {
		/*launchChrome();
		chromeObject();
		winMax();*/
		System.out.println("SearchBoxFunctionality started");
	}
	
	@BeforeMethod(groups="retest")
	public void startTime() {
		implicitWaiting();
		launchUrl(getData(3, 1, 1));
		Date d=new Date();
		System.out.println(d);
	}
	
	/*@Test(groups="smoke")
	public void popupFunctionalityTest3() {
		HomepagePojo hp=new HomepagePojo();
		WebElement acceptAll = hp.getAcceptAll();
		Assert.assertTrue(acceptAll.getText().equalsIgnoreCase("Allow all"));
		acceptAll.click();
	}*/
	
	@Test(dataProvider="searchByItems", dataProviderClass=org.utilities.dataProviderr.class, groups="retest")
	public void testCase1(String SearchByItems) {
		implicitWaiting();
		HomepagePojo hp=new HomepagePojo();
		hp.getSearchBox().sendKeys(SearchByItems);
		hp.getSearchBtn().click();
		staticWait(10000);

		if (SearchByItems.startsWith("spray")) {
			implicitWaiting();
			Assert.assertTrue(driver.getCurrentUrl().contains("spray"));
		} else if (SearchByItems.startsWith("pi")) {
			implicitWaiting();
			Assert.assertTrue(driver.getCurrentUrl().contains("pipe"));
		} else if (SearchByItems.startsWith("drill")) {
			implicitWaiting();
			Assert.assertTrue(driver.getCurrentUrl().contains("drill"));
		} else {
			implicitWaiting();
			Assert.assertTrue(driver.getCurrentUrl().contains("water"));
		} 
		
	}
	
	@AfterMethod(groups="retest")
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
		
	}
	
	@AfterClass(alwaysRun=true)
	public void quitBrowser() {
		closeBrowser();
		
	}


}
