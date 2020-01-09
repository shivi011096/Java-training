package com.example;

public class TesterWeek 
{
	public static void main(String[] args) 
	{
		MyDay day1=new MyDay(WEEK.MONDAY);
		System.out.println("Week day  Name: "+day1.getWeek().getDay()+"day number : "+day1.getWeek().getDaynum());
	}
}
