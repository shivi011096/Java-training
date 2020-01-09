package com.example;

public class HelloArray 
{
	char[] ch;
	public void charArray(String s)
	{
	    ch=s.toCharArray();//to convert String to character type array
		for(int i=0;i<s.length();i++)
		{
			System.out.println(ch[i]+"");
		}
	}
	
	public void display()
	{
		int count=0;
		for(int i=0;i<=ch.length;i++)
		{
			ch=s.charAt(i);
			
			if(ch=='A' || ch='E' || ch='I' || ch='O' || ch='U')
			{
				count++;
				
			}
			
		}
		
		System.out.println("Number of vowels="+count);
	}

}
