package com.configurejava.javaconfig;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configurejava.javaconfig.config.CustomerConfig;
import com.configurejava.javaconfig.model.Customer;
import com.configurejava.javaconfig.service.CustomerService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, SQLException
    {
       AnnotationConfigApplicationContext context=
    		   new AnnotationConfigApplicationContext(CustomerConfig.class);
       BufferedReader br=null;
   	CustomerService service=null;		
		
   	
   	try {
   		br=new BufferedReader(new InputStreamReader(System.in));
		
			service = context.getBean("service", CustomerService.class);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
   	finally {
			context.close();
		}
   	
   	int choice=-1;
   	String uId,firstName,lastName,email=null;
   	List<Customer> list=null;
   	do {
   		System.out.println("1. create customer.");
   		System.out.println("2. display all customer.");
   		System.out.println("3. find customer by uid.");
   		System.out.println("4. update customer.");
   		System.out.println("5. delete customer.");
   		System.out.print("enter your choice>> ");
   		choice=Integer.parseInt(br.readLine());
   		switch (choice) {
			case 1:
				System.out.print("first name>> ");
				firstName=br.readLine();
				System.out.print("last name>> ");
				lastName=br.readLine();
				System.out.print("email>> ");
				email=br.readLine();
				String[] arr=UUID.randomUUID().toString().split("-");
				uId=arr[0]+arr[1];
				service.createCustomer(new Customer(uId, firstName, lastName, email));
				break;
			case 2:
				List<Customer> l=service.getAllCustomers();
				System.out.format("%-20s%-20s%-20s%-20s\n", "ID","FIRST_NAME","LAST_NAME","EMIL");
				l.forEach(c->{
					System.out.println(c);
				});
				break;
			case 3:
				System.out.print("uid>> ");
				uId=br.readLine();
				l=service.getCustomerById(uId);
				if(l.isEmpty())
				{
					System.out.println("customer not found");
				}
				else
				{
					System.out.format("%-20s%-20s%-20s%-20s\n", "ID","FIRST_NAME","LAST_NAME","EMIL");
					l.forEach(c->{
						System.out.println(c);
					});
				}
				break;
			case 4:
				System.out.print(" UID : ");
				uId=br.readLine().toString();
				list=service.getCustomerById(uId);
				if(list.isEmpty())
				{
					System.out.println("no such uid found");
				}
				else {
					Customer c=list.get(0);
					System.out.print(" First Name: ");
					firstName=br.readLine().toString();
					System.out.print(" Last Name: ");
					lastName=br.readLine().toString();
					System.out.print(" Email: ");
					email=br.readLine().toString();
					c.setEmail(email);
					c.setFirstName(firstName);
					c.setLastName(lastName);
					int cust=service.updateCustomerById(c);
					System.out.println("customer updated: "+cust);
				}
				break;
				
			case 5: System.out.print(" UID : ");
			        uId=br.readLine();
			        
			        list=service.getCustomerById(uId);
			        if(list.isEmpty())
			        {
				      System.out.println("No such UID found");
			        }
			        else 
			        {
				      service.deleteCustomer(uId);
				      System.out.println("Deletion sucessfull...");
				
			        }
			        
			        break;	

			default:
				break;
			}
			
		} while (choice !=0);
   	
   	
   	
   	
   	
   	
   	
    	
    }
}