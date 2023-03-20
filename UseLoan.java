package com.oneoft.day17;

public class UseLoan {
	public static void main(String[]args) {
		Loan l=new Loan();
		System.out.println(l.getLoan()+"\n"+l.properities(30000, 300000));
		System.out.println(l.salaryslip(30000));
		
	}

}
