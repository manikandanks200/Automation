package stepDefinition1;

import java.io.IOException;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.common.CommonMethods;
import test.functions.CoreFunction;

public class CucumberStepDefinition {
	
	CoreFunction core=new CoreFunction();
	
	@Given("User on the home page")
	public void user_on_home_page() throws IOException,PendingException{
		System.out.println("sdsfdsd");
		CommonMethods.loadHostandBrowser();
	}
		
	
	@When("User navigate to the login page")
	public void user_navigate_to_login_page() throws IOException,PendingException,Exception{
		System.out.println("sdsfdsd");
		core.HometoLoginPage();
	}
	
	@And("User enters Username and Password")
	public void user_enter_username_and_password() throws IOException,PendingException{
		core.validLogin();
	}
	
	@Then("Message displayed login successfully")
	public void login_validation() throws IOException,PendingException{
		
	}
	
}
