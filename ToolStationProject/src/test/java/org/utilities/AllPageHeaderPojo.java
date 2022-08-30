package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AllPageHeaderPojo extends BaseClass {

	// pagafactory
	public AllPageHeaderPojo() {
		PageFactory.initElements(driver, this);
	}

	// this website uses cookies
	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	private WebElement acceptAll;

	// header locators
	@FindBy(xpath = "(//img[@alt='Toolstation'])[1]")
	private WebElement homepageHeader;

	@FindBy(id = "aa-search-input")
	private WebElement searchBox;

	@FindBy(xpath = "//li[@class='header-nav-item change-store storeName top-menu-item']")
	private WebElement setBranch;

	@FindBy(xpath = "//a[text()='  Register ']")
	private WebElement register;

	@FindBy(xpath = "//a[text()='  Your lists ']")
	private WebElement yourList;

	@FindBy(xpath = "//a[text()='  Help & Advice ']")
	private WebElement helpAndAdvice;

	@FindBy(xpath = "//a[text()='  Quick Order ']")
	private WebElement quickOrder;

	@FindBy(xpath = "//span[text()='Departments']")
	private WebElement departments;

	@FindBy(xpath = "//span[text()='Top Trade Brands']")
	private WebElement topTrendBrand;

	@FindBys({ @FindBy(xpath = "(//span[text()=' Branches '])[2]"), @FindBy(xpath = "(//img[@alt='Branches'])[2]") })
	private WebElement branches;

	@FindBy(xpath = "(//span[text()=' Sign in '])[2]")
	private WebElement signIn;

	@FindBy(xpath = "(//span[text()='Trolley'])[2]")
	private WebElement trolley;

	@FindBy(xpath = "//b[text()='FREE DELIVERY']")
	private WebElement freedelivery;

	@FindBy(xpath = "(//b[text()='CLICK & COLLECT'])")
	private WebElement clickAndCollect;

	@FindBy(xpath = "(//b[text()='EVERYDAY'])")
	private WebElement everyday;

	@FindBy(xpath = "(//b[text()='TRADE ACCOUNT'])")
	private WebElement tradeAccount;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[1]"),
			@FindBy(xpath = "(//a[text()=' Deals '])[1]") })
	private WebElement dealsHeader;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[2]"),
			@FindBy(xpath = "(//a[text()=' Adhesives & Sealants '])[1]") })
	private WebElement adhesivesAndSealantsHeader;

	@FindBys({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[3]"),
			@FindBy(xpath = "(//a[text()=' Automotive '])[1]") })
	private WebElement automotive;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[4]"),
			@FindBy(xpath = "(//a[text()=' Bathrooms '])[1]") })
	private WebElement bathrooms;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[5]"),
			@FindBy(xpath = "(//a[text()=' Deals '])[1]") })
	private WebElement centralHeatingSupplies;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[6]"),
			@FindBy(xpath = "(//a[text()=' Central Heating Supplies '])[1]") })
	private WebElement cleaningAndPestControl;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[7]"),
			@FindBy(xpath = "(//a[text()=' Construction & Insulation '])[1]") })
	private WebElement constructionAndInsulation;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[8]"),
			@FindBy(xpath = "(//a[text()=' Electrical Supplies & Accessories '])[1]") })
	private WebElement electricalSupplieAndAccessories;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[9]"),
			@FindBy(xpath = "(//a[text()=' Hand Tools '])[1]") })
	private WebElement handTools;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[10]"),
			@FindBy(xpath = "(//a[text()=' Ironmongery '])[1]") })
	private WebElement ironmongery;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[11]"),
			@FindBy(xpath = "(//a[text()=' Kitchens '])[1]") })
	private WebElement kitchens;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[12]"),
			@FindBy(xpath = "(//a[text()=' Ladders & Storage '])[1]") })
	private WebElement laddersAndStorage;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[13]"),
			@FindBy(xpath = "(//a[text()=' Landscaping '])[1]") })
	private WebElement landscaping;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[14]"),
			@FindBy(xpath = "(//a[text()=' Lighting '])[1]") })
	private WebElement lighting;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[15]"),
			@FindBy(xpath = "(//a[text()=' Painting & Decorating '])[1]") })
	private WebElement paintingAndDecorating;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[16]"),
			@FindBy(xpath = "(//a[text()=' Plumbing '])[1]") })
	private WebElement plumbing;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[17]"),
			@FindBy(xpath = "(//a[text()=' Power Tools '])[1]") })
	private WebElement powerTools;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[18]"),
			@FindBy(xpath = "(//a[text()=' Power Tool Accessories '])[1]") })
	private WebElement powerToolAccessories;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[19]"),
			@FindBy(xpath = "(//a[text()=' Security '])[1]") })
	private WebElement security;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[20]"),
			@FindBy(xpath = "(//a[text()=' Screws & Fixings '])[1]") })
	private WebElement screwsAndFixings;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[21]"),
			@FindBy(xpath = "(//a[text()=' Smart Home '])[1]") })
	private WebElement smartHome;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[22]"),
			@FindBy(xpath = "(//a[text()=' Ventilation & Heating '])[1]") })
	private WebElement ventilationAndHeating;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[23]"),
			@FindBy(xpath = "(//a[text()=' Workwear & Safety '])[1]") })
	private WebElement workwearAndSafety;

	@FindAll({ @FindBy(xpath = "(//div[@class='megamenu__title-wrapper'])[24]"),
			@FindBy(xpath = "(//a[text()=' Clearance '])[1]") })
	private WebElement clearance;

	@FindBy(xpath = "//h2[text()='Set your local branch']")
	private WebElement setBranchMessage;

	@FindBy(xpath = "//i[@class='fa fa-search']")
	private WebElement searchBtn;

	// getters
	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getSetBranchMessage() {
		return setBranchMessage;
	}

	public WebElement getAcceptAll() {
		return acceptAll;
	}

	public WebElement getHomepageHeader() {
		return homepageHeader;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSetBranch() {
		return setBranch;
	}

	public WebElement getRegister() {
		return register;
	}

	public WebElement getYourList() {
		return yourList;
	}

	public WebElement getHelpAndAdvice() {
		return helpAndAdvice;
	}

	public WebElement getQuickOrder() {
		return quickOrder;
	}

	public WebElement getDepartments() {
		return departments;
	}

	public WebElement getTopTrendBrand() {
		return topTrendBrand;
	}

	public WebElement getBranches() {
		return branches;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getTrolley() {
		return trolley;
	}

	public WebElement getFreedelivery() {
		return freedelivery;
	}

	public WebElement getClickAndCollect() {
		return clickAndCollect;
	}

	public WebElement getEveryday() {
		return everyday;
	}

	public WebElement getTradeAccount() {
		return tradeAccount;
	}

	public WebElement getDealsHeader() {
		return dealsHeader;
	}

	public WebElement getAdhesivesAndSealantsHeader() {
		return adhesivesAndSealantsHeader;
	}

	public WebElement getAutomotive() {
		return automotive;
	}

	public WebElement getBathrooms() {
		return bathrooms;
	}

	public WebElement getCentralHeatingSupplies() {
		return centralHeatingSupplies;
	}

	public WebElement getCleaningAndPestControl() {
		return cleaningAndPestControl;
	}

	public WebElement getConstructionAndInsulation() {
		return constructionAndInsulation;
	}

	public WebElement getElectricalSupplieAndAccessories() {
		return electricalSupplieAndAccessories;
	}

	public WebElement getHandTools() {
		return handTools;
	}

	public WebElement getIronmongery() {
		return ironmongery;
	}

	public WebElement getKitchens() {
		return kitchens;
	}

	public WebElement getLaddersAndStorage() {
		return laddersAndStorage;
	}

	public WebElement getLandscaping() {
		return landscaping;
	}

	public WebElement getLighting() {
		return lighting;
	}

	public WebElement getPaintingAndDecorating() {
		return paintingAndDecorating;
	}

	public WebElement getPlumbing() {
		return plumbing;
	}

	public WebElement getPowerTools() {
		return powerTools;
	}

	public WebElement getPowerToolAccessories() {
		return powerToolAccessories;
	}

	public WebElement getSecurity() {
		return security;
	}

	public WebElement getScrewsAndFixings() {
		return screwsAndFixings;
	}

	public WebElement getSmartHome() {
		return smartHome;
	}

	public WebElement getVentilationAndHeating() {
		return ventilationAndHeating;
	}

	public WebElement getWorkwearAndSafety() {
		return workwearAndSafety;
	}

	public WebElement getClearance() {
		return clearance;
	}

}
