package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewAccount {
	
    @Given("^User is on the home page$")
    public void user_is_on_the_home_page() throws Throwable {
        //throw new PendingException();
        
        System.out.println("Navigated to Landing Page");
    }

    @When("^User clicks on the My Account drop down$")
    public void user_clicks_on_the_my_account_drop_down() throws Throwable {
        //throw new PendingException();
        
        System.out.println("Navigated to Account Dropdown");
    }

    @Then("^Sign Up page is displayed$")
    public void sign_up_page_is_displayed() throws Throwable {
        //throw new PendingException();
        
        System.out.println("Navigated to Sign Up Page");
    }

    @And("^User clicks the Sign Up button$")
    public void user_clicks_the_sign_up_button() throws Throwable {
        throw new PendingException();
    }

    @And("^Sign Up page displayed \"([^\"]*)\"$")
    public void sign_up_page_displayed_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

}


