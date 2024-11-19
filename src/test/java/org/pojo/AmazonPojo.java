package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass{
	public AmazonPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	private WebElement Accounts;
	@FindBy(name = "email")
	private WebElement emailOrMobileno ;
	@FindBy(xpath = "//input[@class='a-button-input']")
	private WebElement conbtn ;
	public WebElement getAccounts() {
		return Accounts;
	}
	public WebElement getEmailOrMobileno() {
		return emailOrMobileno;
	}
	public WebElement getConbtn() {
		return conbtn;
	}
	
}
