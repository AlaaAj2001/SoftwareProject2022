package Beautymain;

import java.util.ArrayList;

public class Reservation {

	
	public static ArrayList<Reservation> Reservation = new ArrayList<Reservation>() ;
	public String date;
	public String UserName;
	public String PhoneN;
	public String time;
	public String TypeOfR;
	
	public Reservation(String date, String userName, String phoneN, String time, String typeOfR) {
		super();
		this.date = date;
		UserName = userName;
		PhoneN = phoneN;
		this.time = time;
		TypeOfR = typeOfR;
	}
}
