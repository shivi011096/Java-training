package comm.example.hibernatenotation.service;

import java.io.IOException;

import java.util.List;

import comm.example.hibernatenotation.entity.Person;

public interface PersonService {
	public Person createPerson(Person person);
	public List<Person> getAllPersons();
	public Person getPersonByid(Integer id);
	public Person updatePerson(Integer id) throws IOException;
	public void deletePerson(Integer id);

}