package interfacesAbstractDemoVideo4Homework.Concrete;

import interfacesAbstractDemoVideo4Homework.Abstract.BaseCustomerManager;
import interfacesAbstractDemoVideo4Homework.Abstract.ICustomerCheckService;
import interfacesAbstractDemoVideo4Homework.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	ICustomerCheckService customerCheckService;

	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Doðrulandý");
		} else {
			System.out.println("Doðrulanmadý");
		}
	}

}
