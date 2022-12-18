package AcceptancePackage;

import static org.junit.Assert.assertTrue;

import Beautymain.Services;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ServicesSteps
{
	Services S;
	String SN, P;
	int SERVICESflag = 10;
	@Given("Services that already exist")
	public void services_that_already_exist(io.cucumber.datatable.DataTable dataTable) {
		String SName, SP;
		for(int i=0; i< dataTable.height() ; i++) {
				SName = dataTable.cell(i,0);
				SP = dataTable.cell(i,1);
				
				S = new Services(SName, SP);
				Services.SERVICES.add(i, S);
				}
		}

	@Given("This services {string} ,which its price is {string}")
	public void this_services_which_its_price_is(String sn, String sp) {
	   SN=sn;
	   P=sp;
	   }

	@When("it is entered before")
	public void it_is_entered_before() {
		for(int i=0; i< Services.SERVICES.size() ; i++) {
			while((Services.SERVICES.get(i).ServicesName.contains(SN)) && (Services.SERVICES.get(i).ServicesPrice.contains(P))) {
				SERVICESflag = 0;
				break;
				}
			}
		}

	@Then("System show admin that this service is one of the services provided by the salon")
	public void system_show_admin_that_this_service_is_one_of_the_services_provided_by_the_salon() {
		assertTrue(SERVICESflag == 0);
	}

	@When("it is not entered before")
	public void it_is_not_entered_before() {
		
		for(int i=0; i< Services.SERVICES.size() ; i++) {
			if((!Services.SERVICES.get(i).ServicesName.contains(SN)) && (!Services.SERVICES.get(i).ServicesPrice.contains(P))) {
				SERVICESflag = 1;
				S = new Services(SN, P);
				Services.SERVICES.add(S);
				}
			}
		}

	@Then("The admin will enter it into the system")
	public void the_admin_will_enter_it_into_the_system() {
		assertTrue(SERVICESflag == 1);
		}
	}
