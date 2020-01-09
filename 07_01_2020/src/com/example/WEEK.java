package com.example;

public enum WEEK
{
	SUNDAY("Today is a holiday.", 1), 
	MONDAY("Today is Monday", 2),
	TUESDAY("Today is Tuesday", 3),
	WEDNESDAY("Today is Wednesday", 4),
	THUSDAY("Today is Thusday", 5),
	FRIDAY("Today is Friday", 6),
	SATURDAY("Today is a holiday", 7);

	private final String day;
	private final int daynum;
	
	private WEEK(String d ,int n) 
	{

		day = d;
		daynum = n;
	}
	public String getDay() 
	{
		return day;
	}

	public int getDaynum() {
		return daynum;
	}
}
