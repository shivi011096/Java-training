package com.practice;

public class Truck extends Transport 
{
	
	@Override
	double calculateDistance(double startPoint, double endPoint) 
	{
		// TODO Auto-generated method stub]
	    setDistance(endPoint-startPoint);	
		return getDistance();
	}

	@Override
	double calculateFuel(double initialfuel, double finalfuel) 
	{
		// TODO Auto-generated method stub
		setFuel(getDistance()/(initialfuel-finalfuel));
		return getFuel();
	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "Truck's "+super.toString();
	}
	
 
}
