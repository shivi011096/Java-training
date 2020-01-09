package com.example;

public class MyClass 
{
	public long add(int...a)//Variable Argument
	{
		int result=0;
		for(int i:a)
		{
			result+=1;
			
		}
		return result;
	}
	
	public String add(String str,int a,int b)
	{
		return str+(a+b);
	}

}
