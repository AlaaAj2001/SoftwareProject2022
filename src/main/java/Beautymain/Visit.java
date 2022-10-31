package Beautymain;

import java.util.ArrayList;

public class Visit {

	
	
	public static ArrayList<Visit> StatusArray = new ArrayList<Visit>() ;
	public String date;
	public String UserName;
	public String time;
	public String TypeOfR;
	public String Status;
	public static ArrayList<Visit> getVisit() {
		return StatusArray;
	}
	public static void setVisit(ArrayList<Visit> statusArray) {
		StatusArray = statusArray;
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
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Visit(String date, String userName, String time, String typeOfR, String status) {
		super();
		this.date = date;
		UserName = userName;
		this.time = time;
		TypeOfR = typeOfR;
		Status = status;
	}
	
	
	
	
	
}
