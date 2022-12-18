package AcceptancePackage;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminSteps{
	String Us, Pass;
	int adminflag = 10; 
	@Given("This user is an admin and his username {string} , Password is {string}")
	public void this_user_is_an_admin_and_his_username_password_is(String username, String pass) {
	   Us=username;
	   Pass=pass;
	}
	@Given("This user is an admin and his username {string} , wrong Password is {string}")
	public void this_user_is_an_admin_and_his_username_wrong_password_is(String username, String pass) {
		Us=username;
		Pass=pass;
	}

	@Given("This user is an admin and his wrong username {string} , wrong Password is {string}")
	public void this_user_is_an_admin_and_his_wrong_username_wrong_password_is(String username, String pass) {
		Us=username;
		Pass=pass;
	}

	@When("he entered his info")
	public void he_entered_his_info() {
	   if ((Us.contains("Admin")) && (Pass.contains("adminpass")))
	   {
		   adminflag = 1;
	   }
	  
	}

	@When("he entered his info with wrong password")
	public void he_entered_his_info_with_wrong_password() {
		 if ((Us.contains("Admin")) && (!Pass.contains("adminpass"))){
			   adminflag = 0;
		   }
		 }

	@When("he entered his info with wrong both of them")
	public void he_entered_his_info_with_wrong_both_of_them() {
		if ((Us != "Admin") && (Pass != "adminpass")){
			   adminflag = 0 ;
			   }
		}
	
	@Then("Login complete successfully and he can access the system administration")
	public void login_complete_successfully_and_he_can_access_the_system_administration() {
		assertEquals(1,adminflag);
	}
	
	@Then("Admin Login failed")
	public void admin_login_failed() {
		assertEquals(0,adminflag);
	}
}
