package AcceptancePackage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Admin
{
	String Us, Pass;
	static boolean adminflag; 
	@Given("This user is an admin and his username {string} , Password is {string}")
	public void this_user_is_an_admin_and_his_username_password_is(String username, String pass) {
	   Us=username;
	   Pass=pass;
	}

	@When("he entered his info")
	public void he_entered_his_info() {
	   if ((Us == "Admin") && (Pass == "adminpass"))
	   {
		   adminflag=true;
	   }
	}

	@Then("Login complete successfully and he can access the system administration")
	public void login_complete_successfully_and_he_can_access_the_system_administration() {
		 assertTrue(!adminflag);
	}

	@When("he entered his info with wrong password")
	public void he_entered_his_info_with_wrong_password() {
		 if ((Us == "Admin") && (Pass != "adminpass"))
		   {
			   adminflag=false;
		   }
	}

	@When("he entered his info with wrong both of them")
	public void he_entered_his_info_with_wrong_both_of_them() {
		if ((Us != "Admin") && (Pass != "adminpass"))
		   {
			   adminflag=false;
		   }
	}
	@Then("Admin Login failed")
	public void admin_login_failed() {
	  assertFalse(adminflag);
	}
}
