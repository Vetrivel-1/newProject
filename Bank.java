package com.oneoft.day17;

public class Bank {
	int PrincipleAmount;
	
	public int getInterest(int principleAmount) {
		return PrincipleAmount*5/100;
	}
	public String loanEligiblity() {
		return "Govt job";
	}
	
	

}
