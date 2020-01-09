package com.example;

public class PasswordCheck 
{
	private String password;
	private int flag;
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/*public PasswordCheck() {
		super();
	}*/
	
	public void checkPassword(String password) throws PasswordNotValidException 
	{
		if(password.length() >=8 && password.length()<=15)
		{
			for(int i=0;i<password.length();i++)
			{
				char c=password.charAt(i);
			
				flag=0;
				if((c >='a' && c<='z') || (c>='A' && c<='Z') || (c>=0 && c<=9))
				{
					flag=1;
					if(flag==0)
						break;
				}
				
			   
			}
			
			if(flag == 0)
				throw new PasswordNotValidException("Invalid Password characters");
		}
			
		
		else
		{
			throw new PasswordNotValidException("Invalid Password length (not between 8 to 15)");
		}
		
		
	}

}
