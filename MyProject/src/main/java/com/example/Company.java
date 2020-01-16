package com.example;

public class Company 
{
	private int pID;
	private String productName;
	private String productType;
	private double price ;

	public Company(String productName, String productType, double price) {
		super();
		this.productName = productName;
		this.productType = productType;
		this.price = price;
	}
}
