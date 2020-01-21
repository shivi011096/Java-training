package comm.example.hibernatenotation.service;

import java.io.IOException;

import java.util.List;

import comm.example.hibernatenotation.dao.PersonDAO;
import comm.example.hibernatenotation.dao.PersonDAOImpl;
import comm.example.hibernatenotation.entity.Person;

public class PersonServiceImpl implements PersonService {
	private PersonDAO dao;
	{
		dao=new PersonDAOImpl();
	}

	@Override
	public Person createPerson(Person person) {
		// TODO Auto-generated method stub
		return dao.createPerson(person);
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return dao.getAllPersons();
	}

	@Override
	public Person getPersonByid(Integer id) {
		// TODO Auto-generated method stub
		return dao.getPersonByid(id);
	}

	@Override
	public Person updatePerson(Integer id) throws IOException {
		// TODO Auto-generated method stub
		return dao.updatePerson(id);
	}

	@Override
	public void deletePerson(Integer id) {
		dao.deletePerson(id);

	}

}