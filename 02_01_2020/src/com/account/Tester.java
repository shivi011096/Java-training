package com.account;
import java.util.Scanner;

public class Tester
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Select type of account [0-4]");
int choice = sc.nextInt();
Account account;
switch(choice)
{
case 1 : account = Account.createAccount(AccountType.CREDITCARD, 1223);
account.displayAccountDetails();
break;
case 2 : account = Account.createAccount(AccountType.LOAN, 146223);
account.displayAccountDetails();
break;
case 3 : account = Account.createAccount(AccountType.SAVINGS, 13223);
account.displayAccountDetails();
break;
case 4 : account = Account.createAccount(AccountType.CURRENT, 184423);
account.displayAccountDetails();

break;
default: System.out.println("Invalid Choice");
}
}

}
