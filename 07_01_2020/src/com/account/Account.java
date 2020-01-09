package com.account;

public class Account {
 private Integer account_id;
 private String holder_name;
 private String address;
 
public Account(Integer account_id, String holder_name, String address) {
	super();
	this.account_id = account_id;
	this.holder_name = holder_name;
	this.address = address;
}
//Comparing objects on the basis of account id
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	Account ac = null;
	Boolean result = false;
	//System.out.println("Checking equal");
	if(obj instanceof Account)
	{
		ac = (Account) obj;
	}
	//Since we are using wrapper we use equals below
	if(this.account_id.equals(ac.account_id) )
	{
		result = true;
		
	}
	System.out.print("Account number is same: ");
	return result;
}
@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return super.hashCode();
}
@Override
public String toString( ) {
	// TODO Auto-generated method stub
	return "Account Details: \n"+"Account ID: "+account_id.toString()+"\nHolder Name: "+holder_name+"\nAddress: "+address+"\nAccount Type: "+checkAccountType();
}
public String checkAccountType()
{
 	String type = null;
 	
 	if(this instanceof Current)
 	{
 		type = "Current Account";
 	}
 	else
 	{
 		type = "Savings Account";
 	}
 	return type;
}

}
