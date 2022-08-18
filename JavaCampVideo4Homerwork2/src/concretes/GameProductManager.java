package concretes;

import abstracts.IGameProductManager;
import entities.Campaign;
import entities.Customer;
import entities.GameProduct;

public class GameProductManager implements IGameProductManager {

	@Override
	public void sellGameProduct(GameProduct gameProduct, Customer customer, Campaign campaign) {
		System.out.println(campaign.getNameOfCompaingn() + " kampanyasýnýn " + gameProduct.getNameofGame() + " oyunu "
				+ customer.getName() + " " + customer.getSurname() + " tarafýndan satýn alýnmýþtýr");

	}

}
