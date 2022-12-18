package Beautymain;

import java.util.ArrayList;

public class User {
	public static ArrayList<User> USERS = new ArrayList<User>() ;
	public String Password;
	public String UserName;
	public int PhoneN;
	
	User u;
	
	
	public void setPassword(String password) {
		Password = password;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public void setPhoneN(int phoneN) {
		PhoneN = phoneN;
	}
	
public User(){
	
		}

public User(String n, String p, int pn){
	this.UserName = n;
	this.Password = p;
	this.PhoneN = pn;
	}



}