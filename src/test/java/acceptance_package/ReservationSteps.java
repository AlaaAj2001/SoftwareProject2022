package acceptance_package;




import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;

import beauty_main.Reservation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReservationSteps {
	String Un , Type , Date ,Time,Ph ;
	Reservation R;
	int Reservationflag = 9;
	
	
@BeforeClass
@Given("Pre-booked Users.")
public void preBookedUsers(io.cucumber.datatable.DataTable dataTable) {
   
	String UserName,Type , Date ,Time ;
	String PhoneNu;
	for(int i=0; i< dataTable.height() ; i++) 
	{
		UserName = dataTable.cell(i,0);
		PhoneNu = dataTable.cell(i,1);
	    Type = dataTable.cell(i,2);
	    Date = dataTable.cell(i,3);
	    Time = dataTable.cell(i,4);
		
	    R = new Reservation(Date , UserName, PhoneNu ,Time , Type );
		Reservation.getR().add(i, R);
		}
	}



	
@Given("This Pre-existing user has username {string} ,PhoneNumber is {string} ,booked an appointment for {string} ,on date {string} ,at {string}")
public void this_pre_existing_user_has_username_phone_number_is_booked_an_appointment_for_on_date_at(String username, String PhN, String type, String date, String time) {
	Un = username ;
	Ph = PhN;
	Type = type;
	Date = date;
	Time=time;
	}


@Given("This user does not exist before has username {string} ,PhoneNumber is {string} ,booked an appointment for {string} ,on date {string} ,at {string}")
public void this_user_does_not_exist_before_has_username_phone_number_is_booked_an_appointment_for_on_date_at(String username, String PhN, String type, String date, String time) {
	Un = username ;
	Ph = PhN;
    Type = type;
    Date = date;
    Time=time;
    }

@Given("This user does not exist before his username {string} ,PhoneNumber is {string} ,booked an appointment for {string} ,on date {string} ,at {string}")
public void this_user_does_not_exist_before_his_username_phone_number_is_booked_an_appointment_for_on_date_at(String username, String PhN, String type, String date, String time) {
	Un = username ;
	Ph = PhN;
	Type = type;
	Date = date;
	Time=time;
	}



@When("this reservation exists")
public void this_reservation_exists() {
	for(int i=0; i< Reservation.getR().size() ; i++) {
		while((Reservation.getR().get(i).getUserName().contains(Un)) && (Reservation.getR().get(i).getPhoneN().contains(Ph)) && (Reservation.getR().get(i).getTypeOfR().contains(Type))&& (Reservation.getR().get(i).getDate().contains(Date)) && (Reservation.getR().get(i).getTime().contains(Time))) {
			Reservationflag = 0;
			break;
			}
		}
	}

@When("He has not reserved before and system allow to book it")
public void he_has_not_reserved_before_and_system_allow_to_book_it() {
	for(int i=0; i< Reservation.getR().size() ; i++) {
		if((!Reservation.getR().get(i).getUserName().contains(Un)) && (!Reservation.getR().get(i).getPhoneN().contains(Ph)) && (!Reservation.getR().get(i).getTypeOfR().contains(Type)) && (!Reservation.getR().get(i).getDate().contains(Date)) && (!Reservation.getR().get(i).getTime().contains(Time))) {
			Reservationflag = 1;
			R = new Reservation(Date , Un, Ph ,Time , Type );
			Reservation.getR().add(i, R);
			break;
			}   
		}
	}

@When("He has not reserved before and system does not allow to book it")
public void he_has_not_reserved_before_and_system_does_not_allow_to_book_it() {
	for(int i=0; i< Reservation.getR().size() ; i++) {
		if((!Reservation.getR().get(i).getUserName().contains(Un)) && (!Reservation.getR().get(i).getPhoneN().contains(Ph)) && (!Reservation.getR().get(i).getTypeOfR().contains(Type)) && (!Reservation.getR().get(i).getDate().contains(Date)) && (!Reservation.getR().get(i).getTime().contains(Time))) {
			Reservationflag = 0;
			break;
			}   
		}
	}

@Then("System show him it is already exist")
public void system_show_him_it_is_already_exist() {
	assertEquals(0,Reservationflag);
	}



@Then("This appointment has been successfully booked")
public void this_appointment_has_been_successfully_booked() {
	assertEquals(1,Reservationflag);
	}


@Then("This reservation was rejected")
public void this_reservation_was_rejected() {
	assertEquals(0,Reservationflag);
	}
}