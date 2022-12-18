package beauty_main;

import java.util.ArrayList;
import java.util.List;

public class Visit {
	protected static final List<Visit> SA = new ArrayList<>() ;
	protected String date;
	protected String userName;
	protected String time;
	protected String typeOfR;
	protected String status;
	
	public Visit(String date, String username, String time, String typeofR, String st) {
		super();
		this.date = date;
		userName = username;
		this.time = time;
		typeOfR = typeofR;
		status = st;
		}

	public static List<Visit> getSa() {
		return SA;
	}

	public String getDate() {
		return date;
	}

	public String getUserName() {
		return userName;
	}

	public String getTime() {
		return time;
	}

	public String getTypeOfR() {
		return typeOfR;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	}
