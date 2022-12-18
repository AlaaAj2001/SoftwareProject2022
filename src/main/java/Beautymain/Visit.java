package Beautymain;

import java.util.ArrayList;

public class Visit {

	
	
	public static ArrayList<Visit> StatusArray = new ArrayList<Visit>() ;
	public String date;
	public String UserName;
	public String time;
	public String TypeOfR;
	public String Status;
	
	public Visit(String date, String userName, String time, String typeOfR, String status) {
		super();
		this.date = date;
		UserName = userName;
		this.time = time;
		TypeOfR = typeOfR;
		Status = status;
	}
	
	
	
	
	
}
