package beauty_main;

import java.util.ArrayList;
import java.util.List;

public class Services{
	protected static final List<Services> S = new ArrayList<>() ;
	protected String servicesName;
	protected String servicesPrice;
	
	
	
	public Services(String servicesname, String servicesprice) {
		super();
		servicesName = servicesname;
		servicesPrice = servicesprice;
	}



	public static List<Services> getS() {
		return S;
	}



	public String getServicesName() {
		return servicesName;
	}



	public String getServicesPrice() {
		return servicesPrice;
	}
	
	
}
