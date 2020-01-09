package com.account;

public class Savings extends Account{
	Float rate_interest;
	public Savings(Integer account_id, String holder_name, String address, Float rate_interest) {
		super(account_id, holder_name, address);
		this.rate_interest = rate_interest;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//System.out.println("\nRate of Interest: "+rate_interest+"%");
		return super.toString()+"\nRate of Interest: "+rate_interest+"%";
		
	}

}