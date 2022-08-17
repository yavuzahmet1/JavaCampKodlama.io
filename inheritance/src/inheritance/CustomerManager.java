package inheritance;

public class CustomerManager {

	/*
	 * public void add(IndividualCustomer customer) {
	 * System.out.println(customer.customerNumber +
	 * " müþteri numarasý kaydedildi.");
	 * 
	 * }
	 * 
	 * public void add(CorporateCustomer customer) {
	 * System.out.println(customer.customerNumber + " þirket numarasý kaydedildi.");
	 * 
	 * }
	 */

	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " numara kaydedildi.");
	}

	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}

}
