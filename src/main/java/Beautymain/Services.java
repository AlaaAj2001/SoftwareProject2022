package Beautymain;

import java.util.ArrayList;

public class Services
{
	public static ArrayList<Services> SERVICES = new ArrayList<Services>() ;
	public String ServicesName;
	public String ServicesPrice;
	public static ArrayList<Services> getSERVICES() {
		return SERVICES;
	}
	public static void setSERVICES(ArrayList<Services> sERVICES) {
		SERVICES = sERVICES;
	}
	public String getServicesName() {
		return ServicesName;
	}
	public void setServicesName(String servicesName) {
		ServicesName = servicesName;
	}
	public String getServicesPrice() {
		return ServicesPrice;
	}
	public void setServicesPrice(String servicesPrice) {
		ServicesPrice = servicesPrice;
	}
	public Services(String servicesName, String servicesPrice) {
		super();
		ServicesName = servicesName;
		ServicesPrice = servicesPrice;
	}
	
}
