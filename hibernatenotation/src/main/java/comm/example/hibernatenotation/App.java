package comm.example.hibernatenotation;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import comm.example.hibernatenotation.entity.Person;
import comm.example.hibernatenotation.service.PersonService;
import comm.example.hibernatenotation.service.PersonServiceImpl;

public class App {

	private static PersonService service;
	static {
		service = new PersonServiceImpl();
	}

	public static void main(String args[]) throws NumberFormatException, IOException, SQLException {
		int choice = 0,id;
		String cName,uId;
		LocalDate dateOfBirth;
		List<Person> list=null;
		Person person=null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("======================\n1. create customer");
			System.out.println("2. display all customers");
			System.out.println("3. find customer by id");
			System.out.println("4. update customer");
			System.out.println("5. delete customer");
			System.out.println("0. exit");
			System.out.print("choice: ");
			choice = Integer.parseInt(br.readLine().toString());
			switch (choice) {
			case 1:
				System.out.print("Name: ");
				cName=br.readLine().toString();
				System.out.print("Date of Birth(yyyy-mm-dd): ");
				//DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/mm/dd");
				String str=br.readLine();
				dateOfBirth = LocalDate.parse(str);
				String arr[]=UUID.randomUUID().toString().split("-");
				Person thePerson=new Person((arr[0]+arr[1]), cName, dateOfBirth);
				person=service.createPerson(thePerson);
				System.out.println("Create Customer Sucess "+person);
				break;
				
			case 2:
				list=service.getAllPersons();
				System.out.format("%-20s%-20s%-20s%-20s\n","UID",
						"NAME","DATEOFBIRTH");
				list.forEach(c->{
					System.out.format("%-20s%-20s%-20s%-20s\n",c.getUId()
							,c.getCName(),c.getDateOfBirth());
				});
				break;
				
			case 3:
				System.out.print(" ID: ");
				id=Integer.parseInt(br.readLine().toString());;
				person=service.getPersonByid(id);
				if(list.isEmpty())
				{
					System.out.println("no such id found");
				}
				else {
					Person c=list.get(0);
					System.out.println("customer found: "+c);
				}
				break;
				
			case 4:	
				System.out.print(" ID : ");
				id=Integer.parseInt(br.readLine().toString());
				person=service.getPersonByid(id);
				if(list.isEmpty())
				{
					System.out.println("no such id found");
				}
				else {
					Person p=list.get(0);
					System.out.print("Name: ");
					cName=br.readLine().toString();
					System.out.print("Date of Birth: ");
					//DateTimeFormatter dateFormat1 = DateTimeFormatter.ofPattern("mm/dd/yyyy");
					String str1=br.readLine();
					dateOfBirth = LocalDate.parse(str1);
					p.setCName(cName);
					p.setDateOfBirth(dateOfBirth);
					person=service.updatePerson(p.getId());
					System.out.println("customer updated: "+person);
				}
				break;
				
			case 5:
				System.out.print(" ID : ");
				id=Integer.parseInt(br.readLine().toString());;
				person=service.getPersonByid(id);
				if(list.isEmpty())
				{
					System.out.println("No such UID found");
				}
				else 
				{
					service.deletePerson(id);
					System.out.println("Deletion sucessfull...");
					
				}
				break;
				
			case 0:
				System.exit(0);
				break;
				
			default:
				System.out.println("invalid choice");
				break;
			}

		} while (choice != 0);

	}
}