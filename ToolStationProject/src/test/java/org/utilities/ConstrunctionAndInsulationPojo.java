package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ConstrunctionAndInsulationPojo extends BaseClass {

	// pagafactory
	public ConstrunctionAndInsulationPojo() {
		PageFactory.initElements(driver, this);
	}

	// construction and insulation locators
	@FindBy(xpath = "(//a[text()=' Builders Metalwork '])[2]")
	private WebElement buildersMetalwork;

	@FindBy(xpath = "(//a[text()=' Insulation '])[2]")
	private WebElement insulation;

	@FindBy(xpath = "(//a[text()=' Admixtures & Mortars '])[2]")
	private WebElement admixturesAndMortars;

	@FindBy(xpath = "(//a[text()=' Joinery '])[2]")
	private WebElement joinery;

	@FindBy(xpath = "(//a[text()=' Roofing '])[2]")
	private WebElement roofing;

	@FindBy(xpath = "(//a[text()=' PVA '])[2]")
	private WebElement pVA;

	@FindBy(xpath = "(//a[text()=' Damp Proofing '])[2]")
	private WebElement dampProofing;

	@FindBy(xpath = "(//a[text()=' Flooring '])[2]")
	private WebElement flooring;

	@FindBy(xpath = "(//a[text()=' Site Equipment '])[2]")
	private WebElement siteEquipment;

	@FindBy(xpath = "(//a[text()=' Fascia and Soffit '])[2]")
	private WebElement fasciaAndSoffit;

	// Concrete & Cement Mixers elements
	@FindAll({ @FindBy(xpath = "(//a[contains(@title,'Site Equipment - The Handy / Handy 90L ')])[2]"),
			@FindBy(xpath = "(//span[text()='£300.00'])") })
	private WebElement concreteMixer;

	// product (Site Equipment - The Handy / Handy 90L Electric Cement Mixer 550W)
	@FindBy(xpath = "//a[@id='add-product-delivery']")
	private WebElement delivery;

	@FindBy(xpath = "//h2[text()='Items added to trolley for delivery']")
	private WebElement popUpTrolleyForDelivery;

	// add trolley
	@FindAll({ @FindBy(xpath = "//a[@class='go-trolley-button']"), @FindBy(xpath = "//a[text()='GO TO TROLLEY']") })
	private WebElement prdctTrolley;

	// product in trolley Handy 90L Electric Cement Mixer 550W - (52210)
	@FindBy(xpath = "//span[text()='(52210)']")
	private WebElement productConformation;

	// remove product element
	@FindBy(xpath = "//span[@class='remove-button f2']")
	private WebElement removeButton;

	@FindBy(xpath = "//div[text()='Removed from your trolley']")
	private WebElement removedMessage;

	// getters

	public WebElement getRemovedMessage() {
		return removedMessage;
	}

	public WebElement getRemoveButton() {
		return removeButton;
	}

	public WebElement getProductConformation() {
		return productConformation;
	}

	public WebElement getDelivery() {
		return delivery;
	}

	public WebElement getPopUpTrolleyForDelivery() {
		return popUpTrolleyForDelivery;
	}

	public WebElement getPrdctTrolley() {
		return prdctTrolley;
	}

	public WebElement getBuildersMetalwork() {
		return buildersMetalwork;
	}

	public WebElement getInsulation() {
		return insulation;
	}

	public WebElement getConcreteMixer() {
		return concreteMixer;
	}

	public WebElement getAdmixturesAndMortars() {
		return admixturesAndMortars;
	}

	public WebElement getJoinery() {
		return joinery;
	}

	public WebElement getRoofing() {
		return roofing;
	}

	public WebElement getpVA() {
		return pVA;
	}

	public WebElement getDampProofing() {
		return dampProofing;
	}

	public WebElement getFlooring() {
		return flooring;
	}

	public WebElement getSiteEquipment() {
		return siteEquipment;
	}

	public WebElement getFasciaAndSoffit() {
		return fasciaAndSoffit;
	}

}
