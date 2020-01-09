package com.example;

public class RandomFortune 
{
	String[]  arr = new String[5];
	
	public RandomFortune()
	{
	 arr[0]= "Hello";
	 arr[1]="Morning";
	 arr[2]="Health";
	 arr[3]="Success";
	 arr[4]="Magic";
	}
	
	public void display()
	{
	 
	 System.out.println(arr[(int)Math.random()]);
	}
	
}
