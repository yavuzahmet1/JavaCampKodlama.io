package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1001, "Lenovo V14", 15000, "16 Gb RAM", 10);// instance, örnek oluþturma,
																					// referans

		Product product2 = new Product();// instance, örnek oluþturma, referans
		product2.setId(1042);
		product2.setName("Lenovo V19");
		product2.setDetail("32 Gb RAM");
		product2.setDiscount(15);
		product2.setUnitPrice(10000);

		System.out.println("product2 :" + product2.getUnitPriceAfterDiscount());
		System.out.println("product1 :" + product1.getUnitPriceAfterDiscount());

		/*
		 * product2.id = 1042; product2.name = "Lenovo V19"; product2.unitPrice = 35000;
		 * product2.detail = "32 Gb RAM";
		 */

		Product product3 = new Product();// instance, örnek oluþturma, referans
		/*
		 * product3.id = 1011; product3.name = "Lenovo V44"; product3.unitPrice = 1900;
		 * product3.detail = "8 Gb RAM";
		 */

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}

		System.out.println(products.length);

		Category category1 = new Category();
		category1.setId(0);
		category1.setName("Kulaklýk");

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Bilgisayar");

		System.out.println(category1.getName());
		System.out.println(category2.getName());

		ProductManager productManager = new ProductManager();
		productManager.addToCard(product1);
		productManager.addToCard(product2);
		productManager.addToCard(product3);

	}

}
