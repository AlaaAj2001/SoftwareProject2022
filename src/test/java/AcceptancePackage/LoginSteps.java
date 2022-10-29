package AcceptancePackage;

import org.junit.Assert;

import Beautymain.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	boolean loginflag;
	String Un, P;
	User u;
	
@Given("This user has his username {string} , Password is {string}")
public void thisUserHasHisUsernamePasswordIs(String Username, String Passw) {
	Un = Username;
	P = Passw;
}
	

@When("he logged his info in and he is registered before")
public void heLoggedHisInfoInAndHeIsRegisteredBefore() {
	for(int i=0; i< User.USERS.size() ; i++) {
		while((Un ==  User.USERS.get(i).UserName) &&(P ==  User.USERS.get(i).Password)) {
			loginflag = true;
			}
		}
}

@When("he logged in with wrong password")
public void heLoggedInWithWrongPassword() {
	for(int i=0; i< User.USERS.size() ; i++) {
		while((Un ==  User.USERS.get(i).UserName) && (P !=  User.USERS.get(i).Password)){
			loginflag = false;
			}
		}
	}

@When("he logged in with wrong both of them")
public void heLoggedInWithWrongBothOfThem() {
	for(int i=0; i< User.USERS.size() ; i++) {
		while((Un !=  User.USERS.get(i).UserName) && (P !=  User.USERS.get(i).Password)){
			loginflag = false;
			}
		}
	}

@Then("Login complete successfully")
public void loginCompleteSuccessfully() {
	Assert.assertTrue(loginflag);
}
@Then("Login failed")
public void loginFailed() {
	Assert.assertFalse(loginflag);
}



}



