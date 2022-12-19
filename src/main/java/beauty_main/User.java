package beauty_main;

import java.util.ArrayList;
import java.util.List;

public class User {
	protected static final List<User> U = new ArrayList<>() ;
	protected String password;
	protected String userName;
	protected int phoneN;
	
	User us;
	
	
	public void setPassword(String pass) {
		password = pass;
	}
	public void setUserName(String username) {
		userName = username;
	}
	public void setPhoneN(int phonen) {
		phoneN = phonen;
	}
	
	public static List<User> getU() {
		return U;
	}
	
	public String getPassword() {
		return password;
	}
	public String getUserName() {
		return userName;
	}
	
public User(){
	
		}

public User(String n, String p, int pn){
	this.userName = n;
	this.password = p;
	this.phoneN = pn;
	}



}