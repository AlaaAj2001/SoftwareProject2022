package Beautymain;

import java.util.ArrayList;

public class Reservation {

	
	public static ArrayList<Reservation> Reservation = new ArrayList<Reservation>() ;
	public String date;
	public String UserName;
	public int PhoneN;
	
	public String time;
	public String TypeOfR;
	
	public Reservation(String date, String userName, int phoneN, String time, String typeOfR) {
		super();
		this.date = date;
		UserName = userName;
		PhoneN = phoneN;
		this.time = time;
		TypeOfR = typeOfR;
	}

	public static ArrayList<Reservation> getReservation() {
		return Reservation;
	}

	public static void setReservation(ArrayList<Reservation> reservation) {
		Reservation = reservation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTypeOfR() {
		return TypeOfR;
	}

	public void setTypeOfR(String typeOfR) {
		TypeOfR = typeOfR;
	}
	
	
	
	
	
	
}
