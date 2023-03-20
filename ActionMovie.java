package com.oneoft.day17;

public class ActionMovie extends Movie {
	public String setFightSeqence(int fights) {
		if(fights>=2&&fights<=2) {
			return"HollyWoodMovie";
		}
		else if(fights>=4&&fights<=2) {
			return "normal Action movie";
		}
		else if(fights>=7) {
			return "Action Movie";
		}
		else {
			return "not a action movie";
		}
	}
}
