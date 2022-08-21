package entities.concretes;

import entities.abstracts.Entity;

public class Person implements Entity {
	private String name;
	private String surname;
	private String email;
	// private String password;

	public Person() {

	}

	public Person(String name, String surname, String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
