package Beautymain;

import java.util.ArrayList;
import java.util.List;

public class User {
	public static ArrayList<String> clients = new ArrayList<String>() ;
	public static ArrayList<String> info = new ArrayList<String>() ;
	public String Password;
	public String Email;
	
	
public User(){
		}

public User(String e, String p){
	this.Email = e;
	this.Password = p;
	}


public ArrayList<String> getClients() {
	return clients;
}

public static void setClients(ArrayList<String> clients) {
	User.clients = clients;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}

public String getEmail() {
	return Email;
}

public static ArrayList<String> getInfo() {
	return info;
}

public static void setInfo(ArrayList<String> info) {
	User.info = info;
}

public void setEmail(String email) {
	Email = email;
}

public List<String> adding(){
	info.add("alaaaj2001@gmail.com");
	info.add("12345");
	
	info.add("zena@gmail.com");
	info.add("123456");
	
	info.add("najwa@gmail.com");
	info.add("1234567");
	
	clients.addAll(info);
	
//	for (String n : clients)
//	System.out.println(n);
		
	return clients;
	
}


	}


