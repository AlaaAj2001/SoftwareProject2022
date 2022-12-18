package beauty_main;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
	protected static final List<Invoice> I = new ArrayList<>() ;
	protected String date;
	protected String username;
	protected String price;
	protected String time;
	protected String typeofs;
	
	public Invoice(String date, String username, String price, String time, String typeofs) {
		super();
		this.date = date;
		this.username = username;
		this.price = price;
		this.time = time;
		this.typeofs = typeofs;
	}


	public static List<Invoice> getI() {
		return I;
	}

	public String getDate() {
		return date;
	}


	public String getTypeOfS() {
		return typeofs;
	}

	public String getTime() {
		return time;
	}


	public String getUserName() {
		return username;
	}

	public String getPrice() {
		return price;
	}

}
