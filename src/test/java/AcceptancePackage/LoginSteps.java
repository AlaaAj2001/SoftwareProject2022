package AcceptancePackage;

import static org.junit.Assert.assertTrue;
import Beautymain.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	int loginflag = 10;
	String Un, P;
	User u = new User();
	
	
	
	
	
@Given("This user has his username {string} , Password is {string}")
public void thisUserHasHisUsernamePasswordIs(String Username, String Passw) {
	u.setUserName("Alaa");
	u.setPhoneN(598479222);
	u.setPassword("123456");
	User.USERS.add(u);
	Un = Username;
	P = Passw;
	
}

@Given("This user has his username {string} , wrong Password is {string}")
public void thisUserHasHisUsernameWrongPasswordIs(String Username, String Passw) {
	Un = Username;
	P = Passw;
}

@Given("This user has his wrong username {string} , wrong Password is {string}")
public void thisUserHasHisWrongUsernameWrongPasswordIs(String Username, String Passw) {
	Un = Username;
	P = Passw;
	}

@When("he logged his info in and he is registered before")
public void heLoggedHisInfoInAndHeIsRegisteredBefore() {
	for(int i=0; i< User.USERS.size() ; i++) {
		
		if((User.USERS.get(i).UserName.contains(Un)) && (User.USERS.get(i).Password.contains(P))) {
			
			loginflag = 1;
			break;
			}
		}
	}

@When("he logged in with wrong password")
public void heLoggedInWithWrongPassword() {
	for(int i=0; i< User.USERS.size() ; i++) {
		while((User.USERS.get(i).UserName.contains(Un)) && (!(User.USERS.get(i).Password.contains(P)))){
			loginflag = 0;
			break;
			}
		}
	}

@When("he logged in with wrong both of them")
public void heLoggedInWithWrongBothOfThem() {
	for(int i=0; i< User.USERS.size() ; i++) {
		while(!(User.USERS.get(i).UserName.contains(Un)) && (!(User.USERS.get(i).Password.contains(P)))){
			loginflag = 0;
			break;
			}
		}
	}

@Then("Login complete successfully")
public void loginCompleteSuccessfully() {
	assertTrue(loginflag == 1);
}
@Then("Login failed")
public void loginFailed() {
	assertTrue(loginflag == 0);
}



}



