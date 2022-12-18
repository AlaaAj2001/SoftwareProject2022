package beauty_main;

import java.util.ArrayList;

public class Services
{
	public static ArrayList<Services> SERVICES = new ArrayList<Services>() ;
	public String ServicesName;
	public String ServicesPrice;
	
	
	
	public Services(String servicesName, String servicesPrice) {
		super();
		ServicesName = servicesName;
		ServicesPrice = servicesPrice;
	}
	
}
