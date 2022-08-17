package entities.abstracts;

import entities.concretes.Customer;

public interface CustomerCheckService {
	void checkIfRealCustomer(Customer customer);
}
