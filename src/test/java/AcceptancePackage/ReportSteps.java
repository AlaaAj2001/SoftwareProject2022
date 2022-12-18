package AcceptancePackage;

import static org.junit.Assert.assertTrue;

import beauty_main.Invoice;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReportSteps {
	String Un , Type , Date ,Time, Price, month;
	int ReportFlag = 10;
	Invoice I;
	@Given("Users Reservations.")
	public void users_reservations(io.cucumber.datatable.DataTable dataTable) {
		String UserName, Type, Date,Time, Price;
		for(int i=0; i< dataTable.height() ; i++) {
			UserName = dataTable.cell(i,0);
		    Type = dataTable.cell(i,1);
		    Price  = dataTable.cell(i, 2);
		    Date = dataTable.cell(i,3);
			Time = dataTable.cell(i,4);
			
			I = new Invoice(Date , UserName ,Time , Type, Price );
			Invoice.I.add(i, I);
			}
		}
		
	

	@When("Admin request this report at month {string}")
	public void admin_request_this_report_at_month(String m) {
		month = m;
		for(int i=0; i<Invoice.I.size() ; i++) {
			for(int j=0; j<30 ; j++){
				if(Invoice.I.get(i).date.contains(j + "/" + month + "/2022")) {
					ReportFlag = 1;
					}
				}
			}
		}
				
		

	@Then("System show it to him")
	public void system_show_it_to_him() {
		System.out.print("\n" + "\n" + "Users Reservations information in " + month + " month" + "\n");
		for(int i=0; i<Invoice.I.size()/2 ; i++) {
			for(int j=0; j<30 ; j++){
				if(Invoice.I.get(i).date.contains(j + "/" + month + "/2022")) {
					System.out.print(Invoice.I.get(i).UserName +"\t");
					System.out.print(Invoice.I.get(i).TypeOfS +"\t");
					System.out.print(Invoice.I.get(i).Price +"\t");
					System.out.print(Invoice.I.get(i).date +"\t");
					System.out.print(Invoice.I.get(i).time +"\n");
					}
				}
			}
		assertTrue(ReportFlag == 1);
		}
	}
