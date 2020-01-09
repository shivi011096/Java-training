package com.practice;

public class Driver {
public static void main(String[] args)
{
 Transport t = new Truck();
 t.calculateDistance(150, 300);
 t.calculateFuel(65, 50);
 Transport w = new ACBus();
 w.calculateDistance(300, 400);
 w.calculateFuel(70, 55);
 System.out.println(t+"\n"+w);
}

}