package com.account;
import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account
{
private String accnum;
private double amount;
private LocalDate date;
private AccountType acctype;
static Account a1;


static
{
a1 = new Account();
}
public static Account createAccount (AccountType acctype,double amount)
{
a1.setAccnum(UUID.randomUUID().toString());
a1.setAcctype(acctype);
return a1;
}
public void displayAccountDetails()
{
System.out.println(accnum+"\n"+amount+"\n"+date.toString()+"\n"+acctype);
}



}

