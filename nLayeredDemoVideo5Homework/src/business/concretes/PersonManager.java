package business.concretes;

import java.util.List;
import java.util.regex.Pattern;

import business.abstracts.PersonService;
import dataAccess.abstracts.PersonDao;
import entities.concretes.Person;

public class PersonManager implements PersonService {
	private PersonDao personDao;

	public PersonManager(PersonDao personDao) {
		super();
		this.personDao = personDao;
	}

	@Override
	public void add(Person person) {
		if (person.getEmail() == null || person.getEmail().isEmpty()) {
			System.out.println("invalid e-mail : " + person.getEmail());
		}

		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-])*@" + "(?:[a-zA-Z0-9-]+\\.)+"
				+ "[a-zA-Z]{2,7}$";

		Pattern pattern = Pattern.compile(emailRegex);

		if (pattern.matcher(person.getEmail()).matches()) {
			System.out.println("Valid email : " + person.getEmail());
			personDao.add(person);
		} else {
			System.out.println("invaild e-mail : " + person.getEmail());

		}

	}

	@Override
	public List<Person> getAll() {

		return null;
	}

}
