package AcceptancePackage;

import java.util.Scanner;

import Beautymain.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	String word;
	Scanner sc;
	String email1, pass1;
	User u;
	static boolean loginflag;
	@Given("I have chosen to login")
	public void iHaveChosenToLogin() {
		u = new User();
		u.adding();
	
	   System.out.println("Welcome to our Beauty Salon App");
	   System.out.println("Already have an account? enter word 'Login', if not enter word 'Signin' to create a new acoount.");
	   sc=new Scanner(System.in);
	   word = sc.next();
	   }
	   
	@When("I enter Email as {string} and Password as {string}")
	public void iEnterEmailAsAndPasswordAs(String email, String pass) 
	{
		switch (word)
		{
		case "Login": 
			System.out.println("Welcome to LogIn page");
		    System.out.println("Please enter your email");
		    sc.nextLine();
		    email = sc.next();
		    email1 = email;
			   
				   System.out.println("Please enter your Password");
			       sc.nextLine();
			pass = sc.next();
			pass1 = pass;
			break;
			   
			   case "Signin":
				   System.out.println("Welcome to SignIn page");
				   break;
				   
				   default:
					   break;
				   }   
		   }   
	
	@Then("I will get a message")
	public void Iwillgetamessage() {
		for(int n = 0; n<= u.getClients().size(); n+=2) {
			if((email1.contains(u.getClients().get(n))) && (pass1.contains(u.getClients().get(n+1)))) {
				System.out.println("Sucsses");
			} 
			else System.out.println("Fail");
			}
		
		

	}


}