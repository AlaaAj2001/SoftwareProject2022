package acceptance_package;


import static org.junit.Assert.assertEquals;

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
			Invoice.getI().add(i, I);
			}
		}
		
	

	@When("Admin request this report at month {string}")
	public void admin_request_this_report_at_month(String m) {
		month = m;
		for(int i=0; i<Invoice.getI().size() ; i++) {
			for(int j=0; j<30 ; j++){
				if(Invoice.getI().get(i).getDate().contains(j + "/" + month + "/2022")) {
					ReportFlag = 1;
					}
				}
			}
		}
				
		

	@Then("System show it to him")
	public void system_show_it_to_him() {
		System.out.print("\n" + "\n" + "Users Reservations information in " + month + " month" + "\n");
		for(int i=0; i<Invoice.getI().size()/2 ; i++) {
			for(int j=0; j<30 ; j++){
				if(Invoice.getI().get(i).getDate().contains(j + "/" + month + "/2022")) {
					System.out.print(Invoice.getI().get(i).getUserName() +"\t");
					System.out.print(Invoice.getI().get(i).getTypeOfS() +"\t");
					System.out.print(Invoice.getI().get(i).getPrice() +"\t");
					System.out.print(Invoice.getI().get(i).getDate() +"\t");
					System.out.print(Invoice.getI().get(i).getTime() +"\n");
					}
				}
			}
		assertEquals(1,ReportFlag);
		}
	}
