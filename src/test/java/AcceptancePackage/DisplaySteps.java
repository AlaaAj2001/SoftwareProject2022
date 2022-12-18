package AcceptancePackage;

import static org.junit.Assert.assertEquals;

import beauty_main.Services;
import beauty_main.Team;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisplaySteps {
	Services S;
	Team T;
	int idflag1 = 10, idflag2 = 10;
	String ID1, ID2;
	String SName, SP, TName, ST;
	@Given("Choice table")
	public void choice_table(io.cucumber.datatable.DataTable dataTable) {
		String id;
		for(int i=0; i< dataTable.height() ; i++) {
		    id = dataTable.cell(i,1);
		    if(id.contains("1")){
		    	idflag1 = 1; 
			}
		    else if(id.contains("2")) {
		    	idflag2 = 2;
		    	}
		    }
		}

	@Given("Team table")
	public void team_table(io.cucumber.datatable.DataTable dataTable) {
		for(int i=0; i< dataTable.height() ; i++) {
			TName = dataTable.cell(i,0);
			ST = dataTable.cell(i,1);
			
			T = new Team(TName, ST);
			Team.getTeam().add(i, T);
			}	
		}
	

	@Given("Services table")
	public void services_table(io.cucumber.datatable.DataTable dataTable) {
			
			for(int i=0; i< dataTable.height() ; i++) {
				SName = dataTable.cell(i,0);
				SP = dataTable.cell(i,1);
				
				S = new Services(SName, SP);
				Services.getS().add(i, S);
				}	
			}
		

	@When("Admin asked to display the services {string} that available in the salon with its price")
	public void admin_asked_to_display_the_services_that_available_in_the_salon_with_its_price(String id) {
	   ID1 = id;
	}

	@Then("System show admin all services")
	public void system_show_admin_all_services() {
		int iD;
		iD = Integer.parseInt(ID1);
		if((idflag1 == 1) && (idflag1 == iD)) {
			System.out.print("\n" + "\n" + "\t" + "Salon Services" + "\n");
			System.out.print("Service" + "\t" + "|" + "\t");
			System.out.print("Price" + "\t" + "|" + "\t");
			System.out.print("\n");
			for(int i=0; i<Services.getS().size() ; i++) {
				System.out.print(Services.getS().get(i).getServicesName() + "\t" + "|" + "\t");
				System.out.print(Services.getS().get(i).getServicesPrice() + "\t" + "|" + "\t");
				System.out.print("\n");
				}
			assertEquals(1,idflag1);
			}
		}

	@When("Admin asked to display the The staff team {string} in the salon")
	public void admin_asked_to_display_the_the_staff_team_in_the_salon(String id) {
	   ID2 = id;
	}

	@Then("System show admin all employees")
	public void system_show_admin_all_employees() {
		int iD;
		iD = Integer.parseInt(ID2);
		if((idflag2 == 2) && (idflag2 == iD)) {
			System.out.print("\n" + "\n" + "\t" + "Salon Team and the services provided by each of them" + "\n");
			System.out.print("Employee" + "\t" + "|" + "\t");
		    System.out.print("Service" + "\t" + "|" + "\t");
		    System.out.print("\n");
			for(int i=0; i<Team.getTeam().size()/2 ; i++) {
				System.out.print(Team.getTeam().get(i).getTName() + "\t" + "|" + "\t");
			    System.out.print(Team.getTeam().get(i).getST() + "\t" + "|" + "\t");
			    System.out.print("\n");
			    }
			System.out.print("\n"+ "\n" + "\n");
			assertEquals(2,idflag2);
			}
		}
	}


