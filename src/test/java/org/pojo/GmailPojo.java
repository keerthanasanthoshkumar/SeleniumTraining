package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPojo extends BaseClass {
public GmailPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="identifierId" )
private WebElement email ;


@FindBy(xpath="//span[text()='Next']")
private WebElement nextbutton;


public WebElement getEmail() {
	return email;
}




public WebElement getNextbutton() {
	return nextbutton;
}





}
