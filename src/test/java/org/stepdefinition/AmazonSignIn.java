package org.stepdefinition;

import java.util.List;

import org.base.BaseClass;
import org.pojo.AmazonPojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonSignIn extends BaseClass{
	AmazonPojo a ;
	
	@Given("To launch the chrome browser and maximize the window.")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
		launchBrowser();
	    windowMaximize();
	}

	@When("To launch the url of the amazon application.")
	public void to_launch_the_url_of_the_amazon_application() {
		launchUrl("https://www.amazon.in/");

	}

	@When("To navigate to the signin page.")
	public void to_navigate_to_the_signin_page() {
		a = new AmazonPojo();
		clickBtn(a.getAccounts());
	    
	}

	@When("To pass the mobile no and email in email text box.")
	public void to_pass_the_mobile_no_and_email_in_email_text_box(io.cucumber.datatable.DataTable d) {
		a = new AmazonPojo();
		List<List<String>> l = d.asLists();
		passText(l.get(0).get(2), a.getEmailOrMobileno());
	}

	@When("To navigate to the continue button.")
	public void to_navigate_to_the_continue_button() {
		a = new AmazonPojo();
		clickBtn(a.getConbtn());
	}

	@Then("To the close the browser.")
	public void to_the_close_the_browser() {
		closeEntireBrowser();
	}


}
