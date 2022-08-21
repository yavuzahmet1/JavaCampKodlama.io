package business.abstracts;

import java.util.List;

import entities.concretes.Person;

public interface PersonService {
	void add(Person person);

	List<Person> getAll();

}
