package abstracts;

import entities.Customer;

public interface ICustomerManager {
	void add(Customer customer);

	void delete(Customer customer);

	void update(Customer customer);

}
