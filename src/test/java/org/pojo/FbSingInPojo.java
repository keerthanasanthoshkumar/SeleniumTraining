package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbSingInPojo extends BaseClass{
	public FbSingInPojo() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createNewAcc ;
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement firstNameTxtBox;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement secondNameTxtBox;
	@FindBy(name = "reg_email__")
	private WebElement mobileOrEmailTxtBox;
	@FindBy(name = "reg_passwd__")
	private WebElement newPassword ;
	public WebElement getCreateNewAcc() {
		return createNewAcc;
	}
	public WebElement getFirstNameTxtBox() {
		return firstNameTxtBox;
	}
	public WebElement getSecondNameTxtBox() {
		return secondNameTxtBox;
	}
	public WebElement getMobileOrEmailTxtBox() {
		return mobileOrEmailTxtBox;
	}
	public WebElement getNewPassword() {
		return newPassword;
	}
}
