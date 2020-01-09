package com.account;

public class Current extends Account {
	Boolean isEligible=false;
	Integer amount;
	public Current(Integer account_id, String holder_name, String address, Integer amount) {
		super(account_id, holder_name, address);
		this.amount = amount;
		if(amount>=50000)
		{
			isEligible = true;
		}
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//System.out.println("\nAmount: "+amount+"\nEligible for Current: "+isEligible);
		
		return super.toString()+"\nAmount: "+amount+"\nEligible for Current: "+isEligible;
	}

}