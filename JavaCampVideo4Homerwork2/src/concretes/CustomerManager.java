package concretes;

import abstracts.ICustomerManager;
import entities.Customer;

public class CustomerManager implements ICustomerManager {

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getName() + " " + customer.getSurname() + " kayýt edildi.");

	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getName() + " " + customer.getSurname() + " silindi");

	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getName() + " " + customer.getSurname() + " güncellendi.");

	}

}
