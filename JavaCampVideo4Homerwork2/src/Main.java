import java.time.LocalDate;

import concretes.CustomerManager;
import concretes.GameProductManager;
import entities.Campaign;
import entities.Customer;
import entities.GameProduct;

public class Main {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2021, 02, 03);
		Customer customer = new Customer("Ahmet", "YAVUZ", "12345678909", 1986);
		Customer customer2 = new Customer("Ahmet", "Kazan", "12345677909", 1987);

		GameProduct gameProduct = new GameProduct("Mario", 1200.00, localDate);

		Campaign campaign = new Campaign("Muhtesem Cuma Kampanyasý", 1000.00);

		CustomerManager customerManager = new CustomerManager();
		customerManager.add(customer);
		CustomerManager customerManager2 = new CustomerManager();
		customerManager2.add(customer2);
		GameProductManager gameProductManager = new GameProductManager();
		gameProductManager.sellGameProduct(gameProduct, customer, campaign);
	}

}
