package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.MyntraPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyntraSignIn extends BaseClass{
	MyntraPojo m;
	
	@Given("To launch chrome browser and maximize the window.")
	public void to_launch_chrome_browser_and_maximize_the_window() {
		launchBrowser();
	    windowMaximize();
	}

	@When("To launch the url of the myntra application.")
	public void to_launch_the_url_of_the_myntra_application() {
		launchUrl("https://www.myntra.com/login?referer=https://www.myntra.com/");

	}

	@When("To pass the mobile no in the text box.")
	public void to_pass_the_mobile_no_in_the_text_box() {
	    m = new MyntraPojo();
	    passText("7708603903", m.getMobileNO());
	}

	@When("To click into the continue button.")
	public void to_click_into_the_continue_button() {
	    clickBtn(m.getConbtn());
	}

	@Then("To the close the entire browser.")
	public void to_the_close_the_entire_browser() {
	    closeEntireBrowser();
	}



}
