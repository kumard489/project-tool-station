package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomepagePojo extends AllPageFooterPojo {

	// pagafactory
	public HomepagePojo() {
		PageFactory.initElements(driver, this);
	}

	// homepage locators

	// our top sellers
	@FindBy(xpath = "(//a[@class='product-suggestion '])[6]")
	private WebElement firstProduct;

	@FindBy(xpath = "(//a[@class='product-suggestion '])[7]")
	private WebElement secoundProduct;

	@FindBy(xpath = "(//a[@class='product-suggestion '])[8]")
	private WebElement thirdProduct;

	@FindBy(xpath = "(//a[@class='product-suggestion '])[9]")
	private WebElement fourthProduct;

	// getters
	public WebElement getFirstProduct() {
		return firstProduct;
	}

	public WebElement getSecoundProduct() {
		return secoundProduct;
	}

	public WebElement getThirdProduct() {
		return thirdProduct;
	}

	public WebElement getFourthProduct() {
		return fourthProduct;
	}

}
