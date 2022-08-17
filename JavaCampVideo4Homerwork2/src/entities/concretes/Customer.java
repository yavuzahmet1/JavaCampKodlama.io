package entities.concretes;

import entities.abstracts.Entity;

public class Customer implements Entity {
	private String name;
	private String surname;
	private String nationaltyId;
	private int yearOfBirth;

	public Customer(String name, String surname, String nationaltyId, int yearOfBirth) {
		super();
		this.name = name;
		this.surname = surname;
		this.nationaltyId = nationaltyId;
		this.yearOfBirth = yearOfBirth;
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

	public String getNationaltyId() {
		return nationaltyId;
	}

	public void setNationaltyId(String nationaltyId) {
		this.nationaltyId = nationaltyId;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

}
