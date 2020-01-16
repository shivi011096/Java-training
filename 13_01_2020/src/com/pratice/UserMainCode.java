package com.pratice;

public class UserMainCode 
{
	private String password;
	private static boolean result;
	
	
	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public static boolean checkPassword(String password)
	{
		int counta=0, countA=0, count1=0, countSpecial=0;
		
		if(password.length() >=8 )
		{
			for(int i=0;i<password.length();i++)
			{
				char c=password.charAt(i);
			
				if(c >='a' && c<='z') 
				    counta++;
			    else if(c>='A' && c<='Z')
			    	countA++;
			    else if(c>=0 && c<=9)
			    	count1++;
			    else 
				    countSpecial++;	
			   
			}
			
			if(counta > 0 && countA>0 &&  count1>0 && countSpecial>0)
			{
				System.out.println("Valid Password");
				result= true;
			}
			   
			
			else
			{
				System.out.println("Invalid Password");
				result= false;
			}
				
		}
			
		
		else
		{
			System.out.println("Invalid Password");
			result= false;
		}
		
		
		return result;
	}

}
