package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraPojo extends BaseClass{
	public MyntraPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = ("//input[@class='form-control mobileNumberInput']"))
	private WebElement mobileNO ;
	@FindBy(xpath = "//div[@class='submitBottomOption']")
	private WebElement conbtn ;
	public WebElement getMobileNO() {
		return mobileNO;
	}
	public WebElement getConbtn() {
		return conbtn;
	} 
}
