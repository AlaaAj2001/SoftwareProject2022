package acceptance_package;


import static org.junit.Assert.assertEquals;

import beauty_main.Visit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisitSteps {

	Visit VR;
	String Un , Type , Date ,Time , Status;
	int Visitflag = 8;
	

@Given("booked Users with their state.")
public void booked_users_with_their_state(io.cucumber.datatable.DataTable dataTable) {
	String UserName,Type , Date ,Time ,Status;
	for(int i=0; i< dataTable.height() ; i++){
		UserName = dataTable.cell(i,0);
	    Type = dataTable.cell(i,1);
		Date = dataTable.cell(i,2);
		Time = dataTable.cell(i,3);
		Status = dataTable.cell(i,4);

		VR = new Visit (Date , UserName,Time , Type ,Status);
		Visit.getSa().add(i, VR);
		}
	}

@Given("This user has username {string} ,came to his appointment {string} ,on date {string} ,at {string} ,he was {string}")
public void this_user_has_username_came_to_his_appointment_on_date_at_he_was(String username, String type, String date, String time, String status) {
   Un =username;
   Type = type;
   Date = date;
   Time = time;
   Status = status;
   }

@Given("This user has been visited username {string} ,came to his appointment {string} ,on date {string} ,at {string} ,he was {string}")
public void this_user_has_been_visited_username_came_to_his_appointment_on_date_at_he_was(String username, String type, String date, String time, String status) {
	   Un =username;
	   Type = type;
	   Date = date;
	   Time = time;
	   Status = status;
	   }

@When("he visited the center and was converted into a visitor already")
public void he_visited_the_center_and_was_converted_into_a_visitor_already() {
	for(int i=0; i< Visit.getSa().size() ; i++) {
		while((Visit.getSa().get(i).getUserName().contains(Un)) && (Visit.getSa().get(i).getStatus().contains(Status)) && (Visit.getSa().get(i).getTypeOfR().contains(Type))&& (Visit.getSa().get(i).getDate().contains(Date))&& (Visit.getSa().get(i).getTime().contains(Time))) {
			if(Status.contains("visited")) {
				Visitflag = 0;
				break;
				}
			}
		}
	}
@Then("do nothing")
public void do_nothing() {
	assertEquals(0,Visitflag);
	}


@When("it was time to visit and the user came, but the system had not converted his status to a visitor yet")
public void it_was_time_to_visit_and_the_user_came_but_the_system_had_not_converted_his_status_to_a_visitor_yet() {
	for(int i=0; i< Visit.getSa().size() ; i++) {
		if((Visit.getSa().get(i).getUserName().contains(Un)) && (Visit.getSa().get(i).getStatus().contains(Status)) && (Visit.getSa().get(i).getTypeOfR().contains(Type))&& (Visit.getSa().get(i).getDate().contains(Date))&& (Visit.getSa().get(i).getTime().contains(Time))){
			if(!Status.contains("visited")){
				Visitflag = 1;
				break;
				}
			}
		}
	}

@Then("the system will convert his status to visited")
public void the_system_will_convert_his_status_to_visited() {
for(int i=0; i< Visit.getSa().size() ; i++) {
	if((Visit.getSa().get(i).getUserName().contains(Un)) && (Visit.getSa().get(i).getStatus().contains(Status)) && (Visit.getSa().get(i).getTypeOfR().contains(Type))&& (Visit.getSa().get(i).getDate().contains(Date))&& (Visit.getSa().get(i).getTime().contains(Time))){
		if(Visitflag == 1) {
			Status = "visited";
			Visit.getSa().get(i).setStatus(Status);
			assertEquals(1,Visitflag);
			}
		}
	}
}
}
