public class IfElseDate
{
  public void calculateNum(int month)
  {
    if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
    {
      System.out.println("there are 31 dayz in that month");
    }
    
    else if(month==2)
    { 
      System.out.println("there are 28 days");
    }
    
    else
       System.out.println("there are 30 days in that month");
  }
}


  