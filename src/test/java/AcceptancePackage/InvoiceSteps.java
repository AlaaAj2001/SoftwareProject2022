package AcceptancePackage;


import static org.junit.Assert.assertEquals;

import beauty_main.Invoice;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvoiceSteps {
	String Un , Type , Date ,Time, Price;
	int InvoiceFlag = 10;
	Invoice I;

	@Given("Users.")
	public void users(io.cucumber.datatable.DataTable dataTable) {
		String UserName, Type, Date,Time, Price;
		for(int i=0; i< dataTable.height() ; i++) 
		{
			UserName = dataTable.cell(i,0);
		    Type = dataTable.cell(i,1);
		    Price  = dataTable.cell(i, 2);
		    Date = dataTable.cell(i,3);
			Time = dataTable.cell(i,4);
			
			I = new Invoice(Date , UserName ,Price , Time, Type );
			Invoice.getI().add(i, I);
			}
		
		}

	@Given("This user has username {string} ,booked an appointment for {string} ,and its price {string} ,on date {string} ,at {string}")
	public void this_user_has_username_phone_number_is_booked_an_appointment_for_and_its_price_on_date_at(String username ,String type,String price ,String date, String time) {
		Un = username ;
		Price = price;
		Type = type;
		Date = date;
		Time=time;
	}

	@When("This user request his invoice")
	public void this_user_request_his_invoice() {
		System.out.print(Un + Price + Type + Date + Time + "\n");
		for(int i=0; i< Invoice.getI().size() ; i++) {
			System.out.print(Invoice.getI().get(i).getTypeOfS());
			if((Invoice.getI().get(i).getUserName().contains(Un)) && (Invoice.getI().get(i).getTypeOfS().contains(Type)) && (Invoice.getI().get(i).getDate().contains(Date))&& (Invoice.getI().get(i).getTime().contains(Time)) && (Invoice.getI().get(i).getPrice().contains(Price))) {
				InvoiceFlag = 1;
				break;
				
				}
			}
		}

	@Then("System print it to him")
	public void system_print_it_to_him() {
		
		System.out.print("Invoice Request");
		System.out.print("\n");
		System.out.print("Services performed by" + "\t" + Un + "\t" + "on" + "\t" + Date + "\t" + "at" + "\t" + Time);
		System.out.print("\n");
		System.out.print("\n");
		
		
		System.out.print("Service" + "\t" + "|" + "\t");
		System.out.print("Price" + "\t" + "|" + "\t");
		System.out.print("\n");
		System.out.print(Type + "\t" + "|" + "\t");
		System.out.print(Price + "\t" + "|" + "\t");
		
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("\t");
		System.out.print("Thank you for coming");
		System.out.print("\n");
		assertEquals(1,InvoiceFlag);
	}
}
