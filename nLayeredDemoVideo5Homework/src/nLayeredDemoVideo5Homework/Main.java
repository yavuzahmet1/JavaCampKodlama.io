package nLayeredDemoVideo5Homework;

import business.abstracts.PersonService;
import business.concretes.PersonManager;
import dataAccess.concretes.HibernateDao;
import entities.concretes.Person;

public class Main {

	public static void main(String[] args) {
		PersonService personService = new PersonManager(new HibernateDao());
		Person person = new Person();
		person.setName("Ahmet");
		person.setSurname("YAVUZ");
		person.setEmail("1yavuzahmet@gmail.com");
		Person person2 = new Person();
		person2.setName("Osman");
		person2.setSurname("YAVUZ");
		person2.setEmail("osman.com");
		Person person3 = new Person("Murat", "Kaya", "murat@gmail.com");
		personService.add(person3);
		personService.add(person2);
		personService.add(person);

	}

}
