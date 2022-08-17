package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = { new EmailLogger(), new DatabaseLogger(), new SmsLogger(), new FileLogger() };
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer engin = new Customer(1, "Engin", "DEMIROG");
		customerManager.add(engin);

	}

}
