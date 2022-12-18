package beauty_main;

import java.util.ArrayList;

public class Invoice {
	protected static ArrayList<Invoice> I = new ArrayList<Invoice>() ;
	public String date;
	public String UserName;
	public String Price;
	public String time;
	public String TypeOfS;
	
	public Invoice(String date, String userName, String time, String typeOfS, String price) {
		super();
		this.date = date;
		UserName = userName;
		this.time = time;
		TypeOfS = typeOfS;
		Price = price;
		
	}
}
