package com.practice;

public abstract class Transport 
{
	private double distance;
	private double fuel;
	
	public double getDistance() 
	{
		return distance;
	}
	public void setDistance(double distance) 
	{
		this.distance = distance;
	}
	public double getFuel() 
	{
		return fuel;
	}
	public void setFuel(double fuel) 
	{
		this.fuel = fuel;
	}
	
	abstract double calculateDistance(double startPoint, double endPoint);
	abstract double calculateFuel(double initialfuel,double finalfuel);
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fuel Efficiency: "+getFuel();
	}


}