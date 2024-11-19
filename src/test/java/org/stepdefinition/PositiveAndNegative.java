package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.GmailPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PositiveAndNegative extends BaseClass {
	GmailPojo g;
	@Given("To launch the browser and maximize window.")
	public void to_launch_the_browser_and_maximize_window() {
		launchBrowser();
	    windowMaximize();
	}

	@When("To launch the url of the gmail application")
	public void to_launch_the_url_of_the_gmail_application() {
		 launchUrl("https://accounts.google.com/");
	}

	@When("To pass the valid email in email field.")
	public void to_pass_the_valid_email_in_email_field() {
		g = new GmailPojo();
	    passText("keerthanajaskk@gmail.com" , g.getEmail());
	}

	@When("To click the next button.")
	public void to_click_the_next_button() {
		g = new GmailPojo();
		clickBtn(g.getNextbutton());
	}



}
