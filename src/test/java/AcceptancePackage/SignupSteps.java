package AcceptancePackage;

import static org.junit.Assert.assertFalse;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import Beautymain.User;

public class SignupSteps {	
	User u;
	String Un, P;
	int Ph = 0;
	boolean SignUpflag;
	
	@Given("Registered users")
	public void registeredUsers(io.cucumber.datatable.DataTable dataTable) {
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
	@Given("This user has username {string} , Password is {string} and PhoneNumber is {string}")
	public void thisUserHasUsernamePasswordIsAndPhoneNumberIs(String Username, String Passw, String PhoneN) {
		Un = Username;
		P = Passw;
		PhoneN.valueOf(Ph);
	}
	@When("he is registered before")
	public void heIsRegisteredBefore() {
		for(int i=0; i< User.USERS.size() ; i++) {
			while((Un ==  User.USERS.get(i).UserName) && (P ==  User.USERS.get(i).Password) && (Ph ==  User.USERS.get(i).PhoneN)) 
				SignUpflag = false;
			}
	}
	@Then("System show him it is already registered")
	public void systemShowHimItIsAlreadyRegistered() {
		Assert.assertFalse(SignUpflag);
	}
	
	@When("He has not registered before")
	public void heHasNotRegisteredBefore() {
		for(int i=0; i< User.USERS.size() ; i++) {
			while((Un !=  User.USERS.get(i).UserName) && (P !=  User.USERS.get(i).Password) && (Ph !=  User.USERS.get(i).PhoneN)) {
				
				u = new User(Un, P, Ph);
				User.USERS.add(u);
			}
			
			}
		
	}
	@Then("The registration has been completed successfully")
	public void theRegistrationHasBeenCompletedSuccessfully() {
		Assert.assertTrue(!SignUpflag);
	}
	}
