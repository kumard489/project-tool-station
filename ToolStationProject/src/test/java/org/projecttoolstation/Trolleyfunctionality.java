package org.projecttoolstation;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.utilities.BaseClass;
import org.utilities.ConstrunctionAndInsulationPojo;
import org.utilities.HomepagePojo;

public class Trolleyfunctionality extends BaseClass {

	@BeforeClass(alwaysRun = true)
	public void Startingbrowser() {
		/*
		launchChrome();
		chromeObject();
		winMax();*/

		System.out.println("Trolleyfunctionality started");
	}

	@BeforeMethod(groups = "smoke")
	public void startTime() {
		launchUrl(getData(3, 1, 1));
		Date d = new Date();
		System.out.println(d);
	}

	/* // accepting cookies
	@Test(groups = "smoke")
	public void popupFunctionalityTest1() {
		HomepagePojo hp = new HomepagePojo();
		WebElement acceptAll = hp.getAcceptAll();
		Assert.assertTrue(acceptAll.getText().equalsIgnoreCase("Allow all"));
		acceptAll.click();
	}*/
    
	@Test(groups = "smoke")
	public void testCase1() {
		implicitWaiting();
		HomepagePojo hp = new HomepagePojo();
		SoftAssert sf = new SoftAssert();
		// clicking Construction And Insulation
		moveCursorActions(hp.getDepartments());
		moveCursorActions(hp.getConstructionAndInsulation());
		SingleClkActions(hp.getConstructionAndInsulation());
		sf.assertTrue(driver.getCurrentUrl().contains("construction-insulation"), "Construction-insulation is Tracked");
		// clicking Site Equipment
		ConstrunctionAndInsulationPojo cai = new ConstrunctionAndInsulationPojo();
		jsScroll(cai.getDampProofing());
		jsClick(cai.getSiteEquipment());
		sf.assertTrue(driver.getCurrentUrl().contains("site-equipment"), "Site-equipment is Tracked");
		// clicking product
		jsScroll(cai.getConcreteMixer());
		jsClick(cai.getConcreteMixer());
		sf.assertTrue(driver.getCurrentUrl().contains("p52210"), "Product code: 52210 is Tracked");
		// clicking delivery
		cai.getDelivery().click();
		sf.assertTrue(cai.getPopUpTrolleyForDelivery().getText().contains("added"),
				"trolley for delivery is Tracked");
		// clicking trolley to add that product
		cai.getPrdctTrolley().click();
		sf.assertTrue(driver.getCurrentUrl().contains("trolley"), "Trolley got Tracked");
		sf.assertTrue(cai.getProductConformation().getText().contains("52210"), "Product is added in trolley(cart)");
		// removing product from trolley
		cai.getRemoveButton().click();
		sf.assertTrue(cai.getRemovedMessage().getText().contains("Removed"), "Removed got Tracked");

		sf.assertAll();
	}

	@AfterMethod(groups = "smoke")
	public void endTime() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterClass(alwaysRun = true)
	public void quitBrowser() {
		closeBrowser();
	}

}
