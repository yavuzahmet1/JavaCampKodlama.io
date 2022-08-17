package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "1234";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "56789";

		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNumber = "99990";

		CustomerManager customerManager = new CustomerManager();
		/*
		 * customerManager.add(hepsiBurada); customerManager.add(engin);
		 * customerManager.add(sendikaCustomer);
		 */

		Customer[] customers = { engin, sendikaCustomer, hepsiBurada };
		customerManager.addMultiple(customers);
	}

}
