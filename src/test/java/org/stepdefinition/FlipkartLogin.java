package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.FlipkartPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartLogin extends BaseClass {
	
	FlipkartPojo f ;
	@Given("To launch the chrome browser and maximize window.")
	public void to_launch_the_chrome_browser_and_maximize_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch the url of the flipkart application")
	public void to_launch_the_url_of_the_flipkart_application() {
	    launchUrl("https://www.flipkart.com/account/login?ret=/");
	}

	@When("To pass the valid username in email field.")
	public void to_pass_the_valid_username_in_email_field() {
	    f = new FlipkartPojo();
	    passText("keerthanajaskk@gmail.com", f.getEmail());
	}

	

	@When("To click the otp button.")
	public void to_click_the_otp_button() {
		f = new FlipkartPojo();
		clickBtn(f.getOtpbutton());
	}

	@When("To check whethere navigate to the home page or not.")
	public void to_check_whethere_navigate_to_the_home_page_or_not() {
	    System.out.println("To check your login crenditials");
	}

	@Then("To close the browser.")
	public void to_close_the_browser() {
	    closeEntireBrowser();
	}


}
