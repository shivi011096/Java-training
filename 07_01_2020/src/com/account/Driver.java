package com.account;

public class Driver {
public static void main(String[] args)
{
	Current c = new Current(5434, "Saif", "Xyz Street", 5000);
	Savings s = new Savings(5434, "Manu", "Abc Street", 7.0F);
	System.out.println(c);
	System.out.println(s);
	System.out.println(c.equals(s));
}


}