package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllPageFooterPojo extends AllPageHeaderPojo {

	// pagafactory
	public AllPageFooterPojo() {
		PageFactory.initElements(driver, this);
	}

	// footer locators
	@FindBy(xpath = "//img[@src='https://s3.amazonaws.com/ts-website-content/tsuk/apple-store-badge.svg']")
	private WebElement AppleAppStore;

	@FindBy(xpath = "//img[@src='https://s3.amazonaws.com/ts-website-content/tsuk/google-play-ts.svg']")
	private WebElement GooglePlayStore;

	@FindBy(xpath = "//input[@id='newsletter-email']")
	private WebElement txtSignup;

	@FindAll({ @FindBy(xpath = "//button[@class='news-submit']"), @FindBy(xpath = "//button[text()='Sign up']") })
	private WebElement btnSignup;

	@FindBy(xpath = "(//img[@alt='Browse Catalogue'])[1]")
	private WebElement browseCatalogue;

	@FindBy(xpath = "(//img[@alt='Pinterest'])")
	private WebElement pinterest;

	@FindBy(xpath = "(//img[@alt='LinkedIn'])")
	private WebElement linkedin;

	@FindBy(xpath = "(//img[@alt='YouTube'])")
	private WebElement youtube;

	@FindBy(xpath = "(//img[@alt='Twitter'])")
	private WebElement twitter;

	@FindBy(xpath = "(//img[@alt='Facebook'])")
	private WebElement facebook;

	@FindBy(xpath = "(//img[@alt='Instagram'])")
	private WebElement instagram;

	@FindBy(xpath = "(//img[@alt='Toolstation'])[2]")
	private WebElement homepageFooter;

	@FindBy(xpath = "(//button[@class='footerNavItem'])[1]")
	private WebElement helpAndContact;

	@FindBy(xpath = "(//button[@class='footerNavItem'])[2]")
	private WebElement companyInformation;

	@FindBy(xpath = "(//button[@class='footerNavItem'])[3]")
	private WebElement policies;

	@FindBy(xpath = "(//a[@title='Request a catalogue'])")
	private WebElement requestACatalogue;

	// getters
	public WebElement getAppleAppStore() {
		return AppleAppStore;
	}

	public WebElement getGooglePlayStore() {
		return GooglePlayStore;
	}

	public WebElement getTxtSignup() {
		return txtSignup;
	}

	public WebElement getBtnSignup() {
		return btnSignup;
	}

	public WebElement getBrowseCatalogue() {
		return browseCatalogue;
	}

	public WebElement getPinterest() {
		return pinterest;
	}

	public WebElement getLinkedin() {
		return linkedin;
	}

	public WebElement getYoutube() {
		return youtube;
	}

	public WebElement getTwitter() {
		return twitter;
	}

	public WebElement getFacebook() {
		return facebook;
	}

	public WebElement getInstagram() {
		return instagram;
	}

	public WebElement getHomepageFooter() {
		return homepageFooter;
	}

	public WebElement getHelpAndContact() {
		return helpAndContact;
	}

	public WebElement getCompanyInformation() {
		return companyInformation;
	}

	public WebElement getPolicies() {
		return policies;
	}

	public WebElement getRequestACatalogue() {
		return requestACatalogue;
	}

}
