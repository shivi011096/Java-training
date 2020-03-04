public class Elevator
{
  public boolean doorOpen=flase; // doors are closed by default
  public int currentFloor=1; //All elevator start from first floor
  public final int MAX_Floors=10;
  public final int MIN_Floors=1;

  public void openDoor()
  {
    System.out.println("Opening door.");
    doorOpen=true;
    System.out.println("Doors is opening");

  }

  public void closeDoor()
  {
    System.out.println("Closing door.");
    doorOpen=flase;
    System.out.println("Doors is closing");

  }

  public void goingUp()
  {
    if(currentFloor<MAX_Floors)
    {
      System.out.println("Can go up.");
      currentFloor++;
      System.out.println("going up.");
    }
   
    else
     System.out.println("Can't go up. Already at max floor");
  }


  public void goingDown()
  {
    if(currentFloor>=MIN_Floors)
    {
      System.out.println("Can go down.");
      currentFloor--;
      System.out.println("going down.");
    }
   
    else
     System.out.println("Can't go down. Already at min floor");
    
  }
}

public static void main(String[] args)
{
  Elevator obj=new Elevator();
  obj.openDoor();
  /*obj.closeDoor();
  obj.goingDown();
  obj.goingUp();
  obj.goingUp();
  obj.goingUp();
  obj.goingUp();
  obj.goingUp();
  obj.goingUp();
  obj.goingUp();
  obj.goingUp();
  obj.goingUp();
  obj.goingUp();
  obj.openDoor();
  obj.closeDoor();
  obj.openDoor();*/
}
