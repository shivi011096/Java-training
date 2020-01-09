package com.example;
import java.util.Collections;
import java.util.LinkedList;

public class TestList 
{
   private LinkedList<String> list= new LinkedList<String>();
	
	public void getSortedList()
	{
		list.add("h ello");
		list.add("everyone");
		list.add("good ");
		list.add("morning");
		list.add("people");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	
		
	}
	
	

}
