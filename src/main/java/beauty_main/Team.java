package beauty_main;

import java.util.ArrayList;
import java.util.List;

public class Team {
	protected static final List<Team> T = new ArrayList<>() ;
	protected String tName;
	protected String sT;
	
	public Team(String tname, String st) {
		super();
		tName = tname;
		sT = st;
		}

	public static List<Team> getTeam() {
		return T;
	}

	public String getTName() {
		return tName;
	}

	public String getST() {
		return sT;
	}
	
	}
