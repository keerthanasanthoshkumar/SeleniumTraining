package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.FbPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass{
	
	FbPojo f;
	
	@Given("User has to launch  browser and maximize the  window.")
	public void user_has_to_launch_browser_and_maximize_the_window() {
		launchBrowser();
	    windowMaximize();
	}

	@When("User has to enter the url of the facebook application")
	public void user_has_to_enter_the_url_of_the_facebook_application() {
		 launchUrl("https://en-gb.facebook.com/");

	}

	@When("User has to enter the data {string}in email field.")
	public void user_has_to_enter_the_data_in_email_field(String email) {
	    f = new FbPojo() ; 
	    passText(email, f.getEmail());
	}

	@When("User has to enter the data {string}in password field.")
	public void user_has_to_enter_the_data_in_password_field(String password) {
		 f = new FbPojo() ;
		 passText(password, f.getPassword());
	}

	@When("User has to click the signin button.")
	public void user_has_to_click_the_signin_button() {
		 f = new FbPojo() ;
		 clickBtn(f.getLoginbtn());
	}


}
