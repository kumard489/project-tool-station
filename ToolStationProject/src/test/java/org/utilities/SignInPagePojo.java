package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SignInPagePojo extends AllPageFooterPojo {

	// pagafactory
	public SignInPagePojo() {
		PageFactory.initElements(driver, this);
	}

	// signin page locators
	@FindBy(xpath = "//input[@name='ucu_username']")
	private WebElement txtUserName;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement txtPassword;

	@FindBy(xpath = "//button[text()='Sign in']")
	private WebElement btnLogin;

	@FindBy(xpath = "//a[text()='CREATE MY ACCOUNT']")
	private WebElement btnCreateMyAccount;

	@FindBys({ @FindBy(xpath = "(//input[@type='checkbox'])[1]"), @FindBy(xpath = "(//input[@id='remember'])") })
	private WebElement cbRememberMe;

	@FindBy(xpath = "//a[text()='forgotten password?']")
	private WebElement forgotPassword;

	@FindBy(xpath = "//li[text()='Incorrect login details']")
	private WebElement incorrectLoginDetailsMessage;

	@FindBy(xpath = "//li[text()='The username must be a valid email address']")
	private WebElement usernameValidEmailMessage;

	// getters
	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getUsernameValidEmailMessage() {
		return usernameValidEmailMessage;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getBtnCreateMyAccount() {
		return btnCreateMyAccount;
	}

	public WebElement getCbRememberMe() {
		return cbRememberMe;
	}

	public WebElement getForgotPassword() {
		return forgotPassword;
	}

	public WebElement getIncorrectLoginDetailsMessage() {
		return incorrectLoginDetailsMessage;
	}

}
