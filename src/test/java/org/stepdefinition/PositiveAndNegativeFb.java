package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.FbPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PositiveAndNegativeFb extends BaseClass {
	FbPojo f;
	@Given("To launch  chrome browser and maximize the  window.")
	public void to_launch_chrome_browser_and_maximize_the_window() {
		launchBrowser();
	    windowMaximize();
	}

	@When("To launch the facebook url.")
	public void to_launch_the_facebook_url() {
		launchUrl("https://en-gb.facebook.com/");

	}

	@When("To enter the  username in email field.")
	public void to_enter_the_username_in_email_field() {
		f = new FbPojo();
		passText("keerthanajaskk@gmail.com", f.getEmail());
	}

	@When("To enter the password in password field.")
	public void to_enter_the_password_in_password_field() {
		f = new FbPojo();
		passText("7708603903", f.getPassword());
	}

	@When("To click signin button")
	public void to_click_signin_button() {
		f = new FbPojo();
		clickBtn(f.getLoginbtn());
	}



}
