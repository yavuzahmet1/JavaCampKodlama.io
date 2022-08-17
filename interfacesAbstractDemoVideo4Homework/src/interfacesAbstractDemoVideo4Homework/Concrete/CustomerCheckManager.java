package interfacesAbstractDemoVideo4Homework.Concrete;

import interfacesAbstractDemoVideo4Homework.Abstract.ICustomerCheckService;
import interfacesAbstractDemoVideo4Homework.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		return false;
	}

}
