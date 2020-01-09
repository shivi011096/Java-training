package com.example;

import java.util.Scanner;

public class Matrix
{
	private int [][] a1 = new int [3][3];
	private int [][] a2 = new int [3][3];
	private int [][] sum = new int [3][3];
	Scanner scan = new Scanner(System.in);
	
	public void inputMatrix()
	{
		System.out.println("Enter first array");
		
		for(int i=0; i<3;i++)

	    {
			for(int j=0;j<3;j++)
			{
				a1[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Enter second array");
		
		for(int i=0; i<3;i++)

	    {
			for(int j=0;j<3;j++)
			{
				a2[i][j] = scan.nextInt();
			}
		}
		
	}
	
	public void display()
	{
		System.out.println("Fisrt Matrix");
		for(int i=0; i<3;i++)

	    {
			for(int j=0;j<3;j++)
			{
				System.out.print(a1[i][j]+" ");
			}
			
			System.out.print("\n");
		}
		
		System.out.println("Second Matrix");
		for(int i=0; i<3;i++)

	    {
			for(int j=0;j<3;j++)
			{
				System.out.print(a2[i][j]+" ");
			}
			
			System.out.print("\n");
		}
		
	}
	
	public void sum()
	{
		
		for(int i=0; i<3;i++)

	    {
			for(int j=0;j<3;j++)
			{
				sum[i][j]=a1[i][j] + a2[i][j];
			}
		}
		
	}
	
	public void sumDisplay()
	{
		System.out.println("Sum Matrix :");
		for(int i=0; i<3;i++)

	    {
			for(int j=0;j<3;j++)
			{
				System.out.print(sum[i][j]+"");
			}
			System.out.print("\n");
		}
		
	}
	
	
}
