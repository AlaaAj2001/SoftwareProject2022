package AcceptancePackage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;

import Beautymain.Reservation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReservationSteps {
	
	
	String Un , Type , Date ,Time ;
	int Ph ;
	Reservation R;
	static boolean Reservationflag;
	
	
@BeforeClass
@Given("Pre-booked Users.")
public void preBookedUsers(io.cucumber.datatable.DataTable dataTable) {
   
	String UserName,Type , Date ,Time ;
	int PhoneNu = 0;
	for(int i=0; i< dataTable.height() ; i++) 
	{
			UserName = dataTable.cell(i,0);
		    dataTable.cell(i,1).valueOf(PhoneNu);
			Type = dataTable.cell(i,2);
			Date = dataTable.cell(i,3);
			Time = dataTable.cell(i,4);
			
			
			R = new Reservation(Date , UserName, PhoneNu ,Time , Type );
			Reservation.Reservation.add(i, R);
	}
}



	
@Given("This user has username {string} ,PhoneNumber is {string} ,booked an appointment for {string},on date {string} ,at {string}")
public void this_user_has_username_phone_number_is_booked_an_appointment_for_on_date_at(String username, String PhN, String type, String date, String time) {
   
	Un = username ;
	PhN.valueOf(Ph);
	Type = type;
	Date = date;
	Time=time;
	
	
			
}





@When("this reservation exists")
public void this_reservation_exists() {
	for(int i=0; i< Reservation.Reservation.size() ; i++) {
		while((Un ==  Reservation.Reservation.get(i).UserName) && (Ph ==  Reservation.Reservation.get(i).PhoneN) && (Type ==  Reservation.Reservation.get(i).TypeOfR)&& (Date ==  Reservation.Reservation.get(i).date)&& (Time ==  Reservation.Reservation.get(i).time)) 
			
			Reservationflag = false;
		}
	
	
	
}



@When("He has not reserved before")
public void he_has_not_reserved_before() {
	
	for(int i=0; i< Reservation.Reservation.size() ; i++) {
		while((Un !=  Reservation.Reservation.get(i).UserName) && (Ph !=  Reservation.Reservation.get(i).PhoneN) && (Type !=  Reservation.Reservation.get(i).TypeOfR)&& (Date !=  Reservation.Reservation.get(i).date)&& (Time !=  Reservation.Reservation.get(i).time)) { 
			
				
				R = new Reservation(Date , Un, Ph ,Time , Type );
				Reservation.Reservation.add(i, R);
	
		}   }
}

@Then("System show him it is already exist")
public void system_show_him_it_is_already_exist() {
	
	assertFalse(Reservationflag);
    
}



@Then("This appointment has been successfully booked")
public void this_appointment_has_been_successfully_booked() {
	assertTrue(!Reservationflag);
}


}
