package Beautymain;

import java.util.ArrayList;

public class User {
	public static ArrayList<User> USERS = new ArrayList<User>() ;
	public String Password;
	public String UserName;
	public int PhoneN;
	
	public static ArrayList<User> getUSERS() {
		return USERS;
	}
	public static void setUSERS(ArrayList<User> uSERS) {
		USERS = uSERS;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public int getPhoneN() {
		return PhoneN;
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