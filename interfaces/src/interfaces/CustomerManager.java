package interfaces;

public class CustomerManager {

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}

	// loosly - tightly coupled
	public void add(Customer customer) {
		System.out.println("Müsteri eklendi : " + customer.getFirstName());
		Utils utils = new Utils();
		utils.runLoggers(loggers, customer.getFirstName());
	}

	public void delete(Customer customer) {
		System.out.println("Müsteri silindi : " + customer.getFirstName());
	}
}
