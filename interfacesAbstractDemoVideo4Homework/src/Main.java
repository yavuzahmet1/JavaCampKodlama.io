import interfacesAbstractDemoVideo4Homework.Abstract.BaseCustomerManager;
import interfacesAbstractDemoVideo4Homework.Concrete.NeroCustomerManager;
import interfacesAbstractDemoVideo4Homework.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1, "Ahmet", "YAVUZ", "01.02.1985", "12345678901"));

	}

}
