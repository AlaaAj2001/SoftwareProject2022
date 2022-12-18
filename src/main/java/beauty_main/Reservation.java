package beauty_main;

import java.util.ArrayList;
import java.util.List;

public class Reservation {
	protected static final List<Reservation> R = new ArrayList<>() ;
	protected String date;
	protected String username;
	protected String phoneN;
	protected String time;
	protected String typeofR;
	
	public Reservation(String date, String userName, String phonen, String time, String typeOfR) {
		super();
		this.date = date;
		username = userName;
		phoneN = phonen;
		this.time = time;
		typeofR = typeOfR;
	}

	public String getDate() {
		return date;
	}

	public String getUserName() {
		return username;
	}

	public String getPhoneN() {
		return phoneN;
	}

	public String getTime() {
		return time;
	}

	public String getTypeOfR() {
		return typeofR;
	}

	public static List<Reservation> getR() {
		return R;
	}
	
}
