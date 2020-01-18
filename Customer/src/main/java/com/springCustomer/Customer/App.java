package com.springCustomer.Customer;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{	
    public static void main( String[] args ) throws IOException
    {	
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = 0;
        Service s = context.getBean("service",Service.class);
        do
        {
        	System.out.println("Enter choice\n1. Create Customer:\n2. Show all Customer:\n3. Find Customer by ID:\n0. Exit:");
        	choice = Integer.parseInt(br.readLine());
        	switch(choice)
        	{
        	case 1: System.out.println("Enter customer first name");
        	 		String first = br.readLine();
        	 		System.out.println("Enter customer last name");
        	 		String last = br.readLine();
        	 		System.out.println("Enter customer email");
        	 		String email = br.readLine();
        	 		String id = UUID.randomUUID().toString();
        	 		s.createCustomer(first, last, email, id);
        	 		break;
        	case 2: System.out.println("Displaying...");
        	        List<Customer> l = s.displayCustomer();
        	        Iterator<Customer> i = l.iterator();
        	        while(i.hasNext())
        	        {
        	        	System.out.println(i.next());
        	        }
        	        break;
        	case 3: System.out.println("Find by Id:");
        	 		String findid = br.readLine();
        	 		Customer c = s.findById(findid);
        	 		System.out.println(c);
        	 		break;
        	case 0: choice = 0;
        			break;
        	default: break;		
        	}
        }while(choice!=0);
    }
}