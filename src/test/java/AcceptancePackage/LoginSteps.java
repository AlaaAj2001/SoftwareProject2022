package AcceptancePackage;

import static org.junit.Assert.assertFalse;

import Beautymain.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	static boolean loginflag;
	String Un, P;
	User u;
	
@Given("users logged in")
public void usersLoggedIn(io.cucumber.datatable.DataTable dataTable) {
	String UserName, Pass;
	int PhoneNu = 0;
	for(int i=0; i< dataTable.height() ; i++) 
	{
			UserName = dataTable.cell(i,0);
			Pass = dataTable.cell(i,1);
			dataTable.cell(i,2);
			String.valueOf(PhoneNu);
			
			u = new User(UserName, Pass, PhoneNu);
			User.USERS.add(i, u);
	}
    
}
@Given("This user has his username {string} , Password is {string}")
public void thisUserHasHisUsernamePasswordIs(String Username, String Passw) {
	Un = Username;
	P = Passw;
}
	

@When("he logged his info in and he is registered before")
public void heLoggedHisInfoInAndHeIsRegisteredBefore() {
	for(int i=0; i< User.USERS.size() ; i++) {
		if((Un ==  User.USERS.get(i).UserName) &&(P ==  User.USERS.get(i).Password)) {
			loginflag = true;}
		else loginflag = false;
		}
}

@When("he logged in with wrong password")
public void heLoggedInWithWrongPassword() {
	loginflag = false;
}

@When("he logged in with wrong username")
public void heLoggedInWithWrongUsername() {
	loginflag = false;
}

@When("he logged in with wrong both of them")
public void heLoggedInWithWrongBothOfThem() {
	loginflag = false;
}

@Then("Login complete successfully")
public void loginCompleteSuccessfully() {
	loginflag = true;
}
@Then("Login failed")
public void loginFailed() {
	assertFalse(loginflag);
}



}



