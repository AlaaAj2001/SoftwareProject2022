package AcceptancePackage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

import Beautymain.User;

public class LoginSteps {
	
	User u;
	static boolean loginflag;
	
	public LoginSteps(User u1) {
		u = u1;
	}
	@Given("I have chosen to login")
	public void i_have_chosen_to_login() {
		loginflag = false;
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I log in with the correct email and password")
	public void i_log_in_with_the_correct_email_and_password() {
		loginflag = true;
		// Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should receive a notification that the login was done correctly")
	public void i_should_receive_a_notification_that_the_login_was_done_correctly() {
		assertTrue(loginflag);
	    	// Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should see a welcomed message")
	public void i_should_see_a_welcomed_message() {
		System.out.println(" Welcome To Our Site");
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I log in with the correct email and wrong password")
	public void i_log_in_with_the_correct_email_and_wrong_password() {
		loginflag = false;
		// Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should receive a notification that the login was incorrectly")
	public void i_should_receive_a_notification_that_the_login_was_incorrectly() {
		assertTrue(!loginflag);
		// Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should see a warning message to try again")
	public void i_should_see_a_warning_message_to_try_again() {
		assertTrue(!loginflag);
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I log in with the wrong email and correct password")
	public void i_log_in_with_the_wrong_email_and_correct_password() {
		loginflag = false;
		// Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("I log in with the wrong email and wrong password")
	public void i_log_in_with_the_wrong_email_and_wrong_password() {
		loginflag = false;
		// Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	

	@When("I enter Email as {string} and Password as {string}")
	public void i_enter_email_as_and_password_as(String string, String string2) {
	  if((u.Email == string) && (u.Password == string2 )){
		  loginflag = true;
	  }
	  else loginflag = false;
		// Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("login should be successful")
	public void login_should_be_successful() {
		if(loginflag = true) {
			System.out.println(" Test Pass");
		}
		else System.out.println(" Test Failed");
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
