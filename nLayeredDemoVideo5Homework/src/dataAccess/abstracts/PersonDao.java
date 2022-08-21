package dataAccess.abstracts;

import entities.concretes.Person;

public interface PersonDao {
	void add(Person person);

	void delete(Person person);

	void update(Person person);

}
