package AcceptancePackage;


import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.BeforeClass;

import beauty_main.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupSteps {	
	User u;
	String Un, P;
	int Ph = 0;
	int SignUpflag = 10;
	
	@BeforeClass
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
	
	@Given("This user does not exist before has username {string} , Password is {string} and PhoneNumber is {string}")
	public void this_user_does_not_exist_before_has_username_password_is_and_phone_number_is(String Username, String Passw, String PhoneN) {
		Un = Username;
		P = Passw;
		PhoneN.valueOf(Ph);
	}
	@When("he is registered before")
	public void heIsRegisteredBefore() {
		for(int i=0; i< User.USERS.size() ; i++) {
			if((User.USERS.get(i).UserName.contains(Un)) && (User.USERS.get(i).Password.contains(P))) {
				SignUpflag = 0;
				break;
				}
			}
		}
	@Then("System show him it is already registered")
	public void systemShowHimItIsAlreadyRegistered() {
		assertTrue(SignUpflag == 0);
	}
	
	@When("He has not registered before")
	public void heHasNotRegisteredBefore() {
		for(int i=0; i< User.USERS.size() ; i++) {
			while(!(User.USERS.get(i).UserName.contains(Un)) && (!(User.USERS.get(i).Password.contains(P)))){
				SignUpflag = 1;
				u = new User(Un, P, Ph);
				User.USERS.add(u);
				break;
				}
			}
		}
	@Then("The registration has been completed successfully")
	public void theRegistrationHasBeenCompletedSuccessfully() {
		assertTrue(SignUpflag == 1);
		}
	}
