package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class CreateMyAccountPojo extends AllPageFooterPojo {

	// pagafactory
	public CreateMyAccountPojo() {
		PageFactory.initElements(driver, this);
	}

	// signin page locators
	@FindBy(xpath = "//select[@id='title']")
	private WebElement selectTitle;

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement txtFirstName;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement txtLastName;

	@FindBy(xpath = "//input[@name='telephone']")
	private WebElement txtLandline;

	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement txtMobile;

	@FindBy(xpath = "//input[@name='company']")
	private WebElement txtCompany;

	@FindBy(xpath = "//input[@name='username']")
	private WebElement txtEmail;

	@FindBys({ @FindBy(xpath = "(//input[@type='checkbox'])[1]"), @FindBy(xpath = "(//input[@id='email'])") })
	private WebElement cbEmail;

	@FindBys({ @FindBy(xpath = "(//input[@type='checkbox'])[2]"), @FindBy(xpath = "(//input[@id='mobile'])") })
	private WebElement cbMobile;

	@FindBys({ @FindBy(xpath = "(//input[@type='checkbox'])[3]"), @FindBy(xpath = "(//input[@id='post'])") })
	private WebElement cbPost;

	@FindBys({ @FindBy(xpath = "(//input[@type='checkbox'])[4]"), @FindBy(xpath = "(//input[@id='sms'])") })
	private WebElement cbSms;

	@FindBy(xpath = "(//input[@name='auto-address'])")
	private WebElement txtDeliveryAddress;

	@FindBy(xpath = "(//a[@title='Enter address manually'])")
	private WebElement txtEnterAddressManually;

	@FindBy(xpath = "(//input[@id='house-field'])")
	private WebElement txtHouseNameOrNum;

	@FindBy(xpath = "(//input[@id='a_road-field'])")
	private WebElement txtStreet;

	@FindBy(xpath = "(//input[@id='b_road-field'])")
	private WebElement txtStreet2;

	@FindBy(xpath = "(//input[@id='town-field'])")
	private WebElement txtTown;

	@FindBy(xpath = "(//input[@id='county-field'])")
	private WebElement txtCounty;

	@FindBy(xpath = "(//input[@id='postcode-field'])")
	private WebElement txtPostcode;

	@FindBy(xpath = "(//select[@id='country'])")
	private WebElement txtCountry;

	@FindBy(xpath = "(//input[@id='first-pass'])")
	private WebElement txtFirstpassword;

	@FindBys({ @FindBy(xpath = "(//input[@type='checkbox'])[5]"), @FindBy(xpath = "(//input[@id='show-pass'])") })
	private WebElement cbshowPassword;

	@FindBys({ @FindBy(xpath = "(//input[@type='checkbox'])[6]"), @FindBy(xpath = "(//input[@id='termsAccept'])") })
	private WebElement cbAcceptPolicies;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	private WebElement btnContinue;
	
	@FindBy(xpath="//li[contains(text(),'Your chosen password')]")
	private WebElement shortPasswordMessage;

	

	// getters
	public WebElement getShortPasswordMessage() {
		return shortPasswordMessage;
	}
	
	public WebElement getSelectTitle() {
		return selectTitle;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtLandline() {
		return txtLandline;
	}

	public WebElement getTxtMobile() {
		return txtMobile;
	}

	public WebElement getTxtCompany() {
		return txtCompany;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getCbEmail() {
		return cbEmail;
	}

	public WebElement getCbMobile() {
		return cbMobile;
	}

	public WebElement getCbPost() {
		return cbPost;
	}

	public WebElement getCbSms() {
		return cbSms;
	}

	public WebElement getTxtDeliveryAddress() {
		return txtDeliveryAddress;
	}

	public WebElement getTxtEnterAddressManually() {
		return txtEnterAddressManually;
	}

	public WebElement getTxtHouseNameOrNum() {
		return txtHouseNameOrNum;
	}

	public WebElement getTxtStreet() {
		return txtStreet;
	}

	public WebElement getTxtStreet2() {
		return txtStreet2;
	}

	public WebElement getTxtTown() {
		return txtTown;
	}

	public WebElement getTxtCounty() {
		return txtCounty;
	}

	public WebElement getTxtPostcode() {
		return txtPostcode;
	}

	public WebElement getTxtCountry() {
		return txtCountry;
	}

	public WebElement getTxtFirstpassword() {
		return txtFirstpassword;
	}

	public WebElement getCbshowPassword() {
		return cbshowPassword;
	}

	public WebElement getCbAcceptPolicies() {
		return cbAcceptPolicies;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

}
