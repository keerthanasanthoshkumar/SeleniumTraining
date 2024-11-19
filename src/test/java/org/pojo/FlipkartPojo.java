package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPojo extends BaseClass{
public FlipkartPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement email ;


@FindBy(xpath="//button[text()='Request OTP']")
private WebElement otpbutton;


public WebElement getEmail() {
	return email;
}




public WebElement getOtpbutton() {
	return otpbutton;
}



}
