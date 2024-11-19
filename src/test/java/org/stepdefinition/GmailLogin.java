package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.GmailPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailLogin extends BaseClass {
	GmailPojo g;
	@Given("User has to launch the browser and maximize the  window.")
	public void user_has_to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
	    windowMaximize();
	}

	@When("User has to hit the url of the gmail application")
	public void user_has_to_hit_the_url_of_the_gmail_application() {
	    launchUrl("https://accounts.google.com/");

	}

	@When("User has to pass the data {string}in email field.")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		g = new GmailPojo();
	    passText(em , g.getEmail());
	}

	@When("User has to click the next button.")
	public void user_has_to_click_the_next_button() {
		g = new GmailPojo();
		clickBtn(g.getNextbutton());
	}

	
	@Then("User has to close the browser.")
	public void user_has_to_close_the_browser() {
		closeEntireBrowser();
	}


}

