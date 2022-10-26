package Beautymain;

import java.util.ArrayList;
import java.util.List;



public class User {
	public static ArrayList<String> clients = new ArrayList<String>() ;
	public String Password;
	public String Email;
	
public User(){
		}

public User(String e, String p){
	this.Email = e;
	this.Password = p;
	}

public List<String> getPassWord(){
	
	clients.add("alaa");
	clients.add("");
	clients.add("");
	
	
	return clients;
	
}


	}


