package org.utilities;

import java.lang.reflect.Array;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenPasswordPojo extends AllPageFooterPojo {

	// page factory
	public ForgottenPasswordPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	private WebElement txtFPUsername;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	private WebElement btnReset;

	@FindBy(xpath = "//a[text()='Back to sign in']")
	private WebElement backToSignIn;

	@FindBy(xpath = "//li[text()='Please provide a valid email address']")
	private WebElement invalidMailIdMessage;

	// gettter
	public WebElement getInvalidMailIdMessage() {
		return invalidMailIdMessage;
	}

	public WebElement getTxtFPUsername() {
		return txtFPUsername;
	}

	public WebElement getBtnReset() {
		return btnReset;
	}

	public WebElement getBackToSignIn() {
		return backToSignIn;
	}

}
