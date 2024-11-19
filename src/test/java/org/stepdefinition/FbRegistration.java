package org.stepdefinition;

import java.util.List;

import org.base.BaseClass;
import org.pojo.FbSingInPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class FbRegistration extends BaseClass {
	
	FbSingInPojo f;
	@Given("To launch the browser and maximize the window.")
	public void to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
	    windowMaximize();
	}

	@When("To launch the url of facebook application.")
	public void to_launch_the_url_of_facebook_application() {
		 launchUrl("https://en-gb.facebook.com/");

	}

	@When("To click the create new account button.")
	public void to_click_the_create_new_account_button() {
	   f = new FbSingInPojo();
	   clickBtn(f.getCreateNewAcc());
	}

	@When("To pass firstname text box.")
	public void to_pass_firstname_text_box(DataTable d) {
		List<String> list = d.asList();
		f = new FbSingInPojo();
		passText(list.get(2), f.getFirstNameTxtBox());
	}

	@When("To pass secondname text box.")
	public void to_pass_secondname_text_box() {
		f = new FbSingInPojo();
		passText("inmakes", f.getSecondNameTxtBox());
		
	}
	
	@When("To pass mobileno or email in email text box.")
	public void to_pass_mobileno_or_email_in_email_text_box(DataTable d) {
		List<List<String>> list = d.asLists();
		f = new FbSingInPojo();
		passText(list.get(1).get(1), f.getMobileOrEmailTxtBox());
	}
	@When("To create new password using new password text box.")
	public void to_create_new_password_using_new_password_text_box() {
		
		f = new FbSingInPojo();
		passText("7708603903", f.getNewPassword());	
	}

	@Then("To close the chrome browser.")
	public void to_close_the_chrome_browser() {
	    
	}
	
}
