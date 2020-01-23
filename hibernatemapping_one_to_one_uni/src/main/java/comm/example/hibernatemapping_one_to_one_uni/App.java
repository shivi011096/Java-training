package comm.example.hibernatemapping_one_to_one_uni;

import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

import comm.example.hibernatemapping_one_to_one_uni.entity.Person;
import comm.example.hibernatemapping_one_to_one_uni.service.PersonService;
import comm.example.hibernatemapping_one_to_one_uni.service.PersonServiceImpl;

public class App {

	private static PersonService service;
	static {
		service=new PersonServiceImpl();
	}
	public static void main(String[] args) throws IOException

	{
		
		
		
		
		/*
		 * Person p=service.createPerson(new Person("U102","Rahul",LocalDate.now()));
		 * System.out.println(p);
		 */
		 
		
		  Person p=service.getPersonByid(100);
		  System.out.println(p);
		 
		//service.deletePerson(1);
	}
}